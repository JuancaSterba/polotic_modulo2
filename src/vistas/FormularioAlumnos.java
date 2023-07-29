package vistas;

import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import modelo.Alumno;
import modelo.Area;
import modelo.Coatic;
import modelo.Curso;

public class FormularioAlumnos extends javax.swing.JInternalFrame {

    private Coatic coatic;
    private Set<Curso> empty = new HashSet<>();

    public FormularioAlumnos(Coatic c) {
        this.coatic = c;
        initComponents();

        this.lstAlumnos.setListData(this.coatic.getAlumnos().toArray());
        for (Curso curso : this.coatic.getCursos()){
            this.cmbCursos.addItem(curso);
        }
        this.cmbCursos.setSelectedItem(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstAlumnos = new javax.swing.JList();
        labelNombre = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        labelNombre1 = new javax.swing.JLabel();
        textFieldDni = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList();
        labelNombre2 = new javax.swing.JLabel();
        cmbCursos = new javax.swing.JComboBox();
        btnInscribir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Alumnos");

        lstAlumnos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstAlumnos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                alumnoSeleccionado(evt);
            }
        });
        jScrollPane1.setViewportView(lstAlumnos);

        labelNombre.setText("Nombre");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoAlumno(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarAlumno(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAlumno(evt);
            }
        });

        labelNombre1.setText("DNI");

        jScrollPane2.setViewportView(lstCursos);

        labelNombre2.setText("Cursos");

        btnInscribir.setText("Incribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribirAlumno(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNombre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombre2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbCursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnInscribir))
                                .addComponent(textFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnNuevo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnGuardar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminar))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                        .addComponent(labelNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInscribir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoAlumno
        limpiar();
    }//GEN-LAST:event_nuevoAlumno

    private void guardarAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarAlumno
        // para verificar si hay algo seleccionado en mi lista
        if (this.lstAlumnos.isSelectionEmpty()) {
            // crear un alumno
            this.coatic.crearAlumno(this.textFieldNombre.getText(), this.textFieldDni.getText());
        } else {
            Alumno alumno = (Alumno) this.lstAlumnos.getSelectedValue();
            this.coatic.modificarAlumno(alumno, this.textFieldNombre.getText(), this.textFieldDni.getText());
        }
        limpiar();
    }//GEN-LAST:event_guardarAlumno

    private void eliminarAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAlumno
        if (!this.lstAlumnos.isSelectionEmpty()) {
            Alumno alumno = (Alumno) this.lstAlumnos.getSelectedValue();
            this.coatic.eliminarAlumno(alumno);
            limpiar();
        }
    }//GEN-LAST:event_eliminarAlumno

    private void alumnoSeleccionado(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_alumnoSeleccionado
        if (!this.lstAlumnos.isSelectionEmpty()) {
            Alumno alumno = (Alumno) this.lstAlumnos.getSelectedValue();
            // asigno los valores de los atributos a los componentes
            this.textFieldNombre.setText(alumno.getNombre());
            this.textFieldDni.setText(alumno.getDni());
            
            if (!alumno.getCursos().isEmpty()){
                this.lstCursos.setListData(alumno.getCursos().toArray());
            }
            
            this.lstCursos.setListData(alumno.getCursos().toArray());
        }
        this.cmbCursos.setSelectedItem(null);
    }//GEN-LAST:event_alumnoSeleccionado

    private void inscribirAlumno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribirAlumno
        if (!this.lstAlumnos.isSelectionEmpty()){
            Alumno alumno = (Alumno) this.lstAlumnos.getSelectedValue();
            
            Curso curso = (Curso) this.cmbCursos.getSelectedItem();
            
            this.coatic.inscribir(alumno, curso);
            
            this.lstCursos.setListData(alumno.getCursos().toArray());
            this.cmbCursos.setSelectedItem(null);
        }
        
    }//GEN-LAST:event_inscribirAlumno

    private void limpiar() {
        // limpiar las cajitas de texto
        this.textFieldNombre.setText("");
        this.textFieldDni.setText("");
        System.out.println("Refrescando...");
        Coatic.getPersistencia().refrescar(this.coatic);
        System.out.println("Actualizando...");
        this.lstAlumnos.setListData(this.coatic.getAlumnos().toArray());
        this.lstCursos.setListData(empty.toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbCursos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombre1;
    private javax.swing.JLabel labelNombre2;
    private javax.swing.JList lstAlumnos;
    private javax.swing.JList lstCursos;
    private javax.swing.JTextField textFieldDni;
    private javax.swing.JTextField textFieldNombre;
    // End of variables declaration//GEN-END:variables
}
