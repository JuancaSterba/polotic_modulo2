package vistas;

import modelo.Area;
import modelo.Coatic;
import modelo.Curso;

public class FormularioAreas extends javax.swing.JInternalFrame {

    private Coatic coatic;

    public FormularioAreas(Coatic c) {
        this.coatic = c;
        initComponents();

        this.lstAreas.setListData(this.coatic.getAreas().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstAreas = new javax.swing.JList();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList();

        setClosable(true);
        setTitle("Areas");

        lstAreas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAreas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                areaSeleccionada(evt);
            }
        });
        jScrollPane1.setViewportView(lstAreas);

        labelNombre.setText("Nombre");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoArea(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarArea(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarArea(evt);
            }
        });

        jScrollPane2.setViewportView(lstCursos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnNuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoArea
        limpiar();
    }//GEN-LAST:event_nuevoArea

    private void guardarArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarArea
        // para verificar si hay algo seleccionado en mi lista
        if (this.lstAreas.isSelectionEmpty()) {
            // crear un area
            this.coatic.crearArea(this.textFieldNombre.getText());
        } else {
            Area area = (Area) this.lstAreas.getSelectedValue();
            this.coatic.modificarArea(area, this.textFieldNombre.getText());
        }
        limpiar();
    }//GEN-LAST:event_guardarArea

    private void eliminarArea(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarArea
        if (!this.lstAreas.isSelectionEmpty()) {
            Area area = (Area) this.lstAreas.getSelectedValue();
            this.coatic.eliminarArea(area);
            limpiar();
        }
    }//GEN-LAST:event_eliminarArea

    private void areaSeleccionada(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_areaSeleccionada
        if (!this.lstAreas.isSelectionEmpty()) {
            Area area = (Area) this.lstAreas.getSelectedValue();
            // asigno los valores de los atributos a los componentes
            this.textFieldNombre.setText(area.getNombre());
            this.lstCursos.setListData(area.getCursos().toArray());
        }
    }//GEN-LAST:event_areaSeleccionada

    private void limpiar() {
        // limpiar las cajitas de texto
        this.textFieldNombre.setText("");
        System.out.println("Refrescando...");
        Coatic.getPersistencia().refrescar(this.coatic);
        System.out.println("Actualizando...");
        this.lstAreas.setListData(this.coatic.getAreas().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JList lstAreas;
    private javax.swing.JList lstCursos;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
