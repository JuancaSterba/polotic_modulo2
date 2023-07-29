package vistas;

import modelo.Coatic;
import javax.swing.*;
import java.awt.*;

public class Principal extends javax.swing.JFrame {

    private FormularioAreas areaForm = null;
    private FormularioCursos cursoForm= null;
    private FormularioAlumnos alumnoForm=null;
    private final Coatic coatic;

    public Principal(Coatic c) {
        this.coatic = c;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPanel = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon("src\\img\\coatic.png");
            Image image = icon.getImage();

            Image logo = image.getScaledInstance(500, 550, Image.SCALE_SMOOTH);

            @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(logo, 54, 10, this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAreas = new javax.swing.JMenuItem();
        jmiCursos = new javax.swing.JMenuItem();
        jmiAlumnos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RED COATIC");
        setPreferredSize(new java.awt.Dimension(515, 500));
        setResizable(false);

        dpPanel.setPreferredSize(new java.awt.Dimension(515, 500));

        javax.swing.GroupLayout dpPanelLayout = new javax.swing.GroupLayout(dpPanel);
        dpPanel.setLayout(dpPanelLayout);
        dpPanelLayout.setHorizontalGroup(
            dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        dpPanelLayout.setVerticalGroup(
            dpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jMenu1.setText("Coatic");

        jmiAreas.setText("Areas");
        jmiAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAreas(evt);
            }
        });
        jMenu1.add(jmiAreas);

        jmiCursos.setText("Cursos");
        jmiCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fomCursos(evt);
            }
        });
        jMenu1.add(jmiCursos);

        jmiAlumnos.setText("Alumnos");
        jmiAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formAlumnos(evt);
            }
        });
        jMenu1.add(jmiAlumnos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAreas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAreas
        if (areaForm == null || areaForm.isClosed()) {
            areaForm = new FormularioAreas(coatic);
            this.dpPanel.add(areaForm);
        }
        areaForm.setVisible(true);
    }//GEN-LAST:event_formAreas

    private void fomCursos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fomCursos
        if (cursoForm == null || cursoForm.isClosed()) {
            cursoForm = new FormularioCursos(coatic);
            this.dpPanel.add(cursoForm);
        }
        cursoForm.setVisible(true);
    }//GEN-LAST:event_fomCursos

    private void formAlumnos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formAlumnos
        if (alumnoForm == null || alumnoForm.isClosed()) {
            alumnoForm = new FormularioAlumnos(coatic);
            this.dpPanel.add(alumnoForm);
        }
        alumnoForm.setVisible(true);
    }//GEN-LAST:event_formAlumnos

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAlumnos;
    private javax.swing.JMenuItem jmiAreas;
    private javax.swing.JMenuItem jmiCursos;
    // End of variables declaration//GEN-END:variables
}
