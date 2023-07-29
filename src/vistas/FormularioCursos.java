package vistas;

import modelo.Area;
import modelo.Coatic;
import modelo.Curso;

public class FormularioCursos extends javax.swing.JInternalFrame {

    private Coatic coatic;

    public FormularioCursos(Coatic coatic) {
        this.coatic = coatic;
        initComponents();

        this.lstCursos.setListData(this.coatic.getCursos().toArray());
        for (Area area : this.coatic.getAreas()){
            this.cmbAreas.addItem(area);
        }
        this.cmbAreas.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cmbAreas = new javax.swing.JComboBox();
        labelNombre1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAlumnos = new javax.swing.JList();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        setClosable(true);
        setTitle("Cursos");

        lstCursos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCursos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                cursoSeleccionado(evt);
            }
        });
        jScrollPane1.setViewportView(lstCursos);

        labelNombre.setText("Nombre");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoCurso(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarCurso(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCurso(evt);
            }
        });

        labelNombre1.setText("Area");

        jScrollPane4.setViewportView(lstAlumnos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAreas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNombre)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnGuardar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar)
                                .addGap(12, 12, 12)
                                .addComponent(btnEliminar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoCurso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoCurso
        limpiar();
    }//GEN-LAST:event_nuevoCurso

    private void guardarCurso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarCurso
        // para verificar si hay algo seleccionado en mi lista
        if (this.lstCursos.isSelectionEmpty()) {
            // crear un curso
            this.coatic.crearCurso(
                    this.textFieldNombre.getText(), 
                    (Area) this.cmbAreas.getSelectedItem());
        } else {
            Curso curso = (Curso) this.lstCursos.getSelectedValue();
            this.coatic.modificarCurso(curso, 
                    this.textFieldNombre.getText(), 
                    (Area) this.cmbAreas.getSelectedItem());
        }
        limpiar();
    }//GEN-LAST:event_guardarCurso

    private void eliminarCurso(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCurso
        if (!this.lstCursos.isSelectionEmpty()) {
            Curso curso = (Curso) this.lstCursos.getSelectedValue();
            this.coatic.eliminarCurso(curso);
            limpiar();
        }
    }//GEN-LAST:event_eliminarCurso

    private void cursoSeleccionado(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_cursoSeleccionado
        if (!this.lstCursos.isSelectionEmpty()) {
            Curso curso = (Curso) this.lstCursos.getSelectedValue();
            // asigno los valores de los atributos a los componentes
            this.textFieldNombre.setText(curso.getNombre());
            this.cmbAreas.setSelectedItem(curso.getArea());
            this.lstAlumnos.setListData(curso.getAlumnos().toArray());
        }
    }//GEN-LAST:event_cursoSeleccionado

    private void limpiar() {
        // limpiar las cajitas de texto
        this.textFieldNombre.setText("");
        this.cmbAreas.setSelectedItem(null);
        System.out.println("Refrescando...");
        Coatic.getPersistencia().refrescar(this.coatic);
        System.out.println("Actualizando...");
        this.lstCursos.setListData(this.coatic.getCursos().toArray());
        this.lstCursos.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbAreas;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JList lstAlumnos;
    private javax.swing.JList lstCursos;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
