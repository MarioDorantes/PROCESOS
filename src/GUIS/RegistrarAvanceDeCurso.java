/*MARIO DORANTES
**13/07/2020
*/
 
package GUIS;

import DataAccess.AvanceDeCursoDAO;
import DataAccess.CursoDAO;
import DataAccess.PlanDeCursoDAO;
import Dominio.AvanceDeCurso;
import Dominio.Curso;
import Dominio.PlanDeCurso;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegistrarAvanceDeCurso extends javax.swing.JFrame {
    
    AvanceDeCurso avanceDeCurso;
    AvanceDeCursoDAO avanceDeCursoDAO;
    String id_plan;
    
    public RegistrarAvanceDeCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Avance de Curso");
        try {
            leerPlanesDeCursos();
        } catch (SQLException | ClassNotFoundException sqlException) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a la base de datos en este momento. Intente más tarde.");
            sqlException.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSeccionesAvanceDeCurso = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jLabelPorcentajeDeAvance = new javax.swing.JLabel();
        jTextFieldPorcentajeAvance = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaActividadesRealizadas = new javax.swing.JTextArea();
        jLabelActividadesRealizadas = new javax.swing.JLabel();
        jLabelTemasAbordados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTemasAbordados = new javax.swing.JTextArea();
        jLabelTemasPorVer = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaTemasPorVer = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaActividadesPorRealizar = new javax.swing.JTextArea();
        jLabelActividadesPorRealizar = new javax.swing.JLabel();
        jButtonRegistrarPlan = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSeccionesAvanceDeCurso.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSeccionesAvanceDeCurso.setText("Secciones Avance de Curso");
        getContentPane().add(jLabelSeccionesAvanceDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 30));

        jLabelFecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelFecha.setText("Fecha: ");
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabelPorcentajeDeAvance.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPorcentajeDeAvance.setText("Porcentaje de avance:");
        getContentPane().add(jLabelPorcentajeDeAvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));
        getContentPane().add(jTextFieldPorcentajeAvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 80, 30));

        jTextAreaActividadesRealizadas.setColumns(20);
        jTextAreaActividadesRealizadas.setRows(5);
        jScrollPane2.setViewportView(jTextAreaActividadesRealizadas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 280, 100));

        jLabelActividadesRealizadas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelActividadesRealizadas.setText("Actividades realizadas: ");
        getContentPane().add(jLabelActividadesRealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabelTemasAbordados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTemasAbordados.setText("Temas abordados:");
        getContentPane().add(jLabelTemasAbordados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextAreaTemasAbordados.setColumns(20);
        jTextAreaTemasAbordados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTemasAbordados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 280, 100));

        jLabelTemasPorVer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTemasPorVer.setText("Temas por ver:");
        getContentPane().add(jLabelTemasPorVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jTextAreaTemasPorVer.setColumns(20);
        jTextAreaTemasPorVer.setRows(5);
        jScrollPane3.setViewportView(jTextAreaTemasPorVer);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 280, 100));

        jTextAreaActividadesPorRealizar.setColumns(20);
        jTextAreaActividadesPorRealizar.setRows(5);
        jScrollPane4.setViewportView(jTextAreaActividadesPorRealizar);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 280, 100));

        jLabelActividadesPorRealizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelActividadesPorRealizar.setText("Actividades por realizar: ");
        getContentPane().add(jLabelActividadesPorRealizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jButtonRegistrarPlan.setBackground(new java.awt.Color(153, 255, 153));
        jButtonRegistrarPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarPlan.setText("Registrar Avance");
        jButtonRegistrarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarPlanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 130, 40));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jButtonRegistrarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarPlanActionPerformed
        llenarPlanDeCurso();
        avanceDeCursoDAO = new AvanceDeCursoDAO();
        try {
            avanceDeCursoDAO.guardarAvanceDeCurso(avanceDeCurso);
        } catch (SQLException | ClassNotFoundException sqlException) {
            JOptionPane.showMessageDialog(this, "No es posible acceder a la base de datos en este momento.");
            Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(Level.SEVERE, null, sqlException);
        }
        JOptionPane.showMessageDialog(this, "¡Se registró el Plan de Curso correctamente!");
    }//GEN-LAST:event_jButtonRegistrarPlanActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        int opcionSeleccionada = JOptionPane.showOptionDialog(this,"¿Seguro desea cancelar?", "Cancelar",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, botonesCancelar, botonesCancelar[0] );

        if (opcionSeleccionada == 0) {
            regresarPrincipalProfesor();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    String [] botonesCancelar = {"Si", "No"};
    
    void regresarPrincipalProfesor(){
        VentanaPrincipalProfesor regresarAProfesor = new VentanaPrincipalProfesor();
        regresarAProfesor.setVisible(true);
        dispose();
    } 
    
    void leerPlanesDeCursos() throws SQLException, ClassNotFoundException {
        int i = 0;
        PlanDeCursoDAO planDeCursoDAO = new PlanDeCursoDAO();
        String[] stringPlanDeCursoIDs = null;
        ArrayList<PlanDeCurso> todosLosPlanes = planDeCursoDAO.leerTodosLosPlanesDeCurso();
        List<String> planesDeCursosIDs = new ArrayList<>();
        while (i < todosLosPlanes.size()) {
           planesDeCursosIDs.add(todosLosPlanes.get(i).getId_plan());
           i++;
        }
        stringPlanDeCursoIDs = planesDeCursosIDs.toArray(new String[planesDeCursosIDs.size()]);
        JComboBox jComboBoxListaDeCursos = new JComboBox(stringPlanDeCursoIDs);
        jComboBoxListaDeCursos.setEditable(true);
        JOptionPane.showMessageDialog(null, jComboBoxListaDeCursos, "Seleccione el ID de su Plan De Curso", JOptionPane.QUESTION_MESSAGE);
        id_plan = (String) jComboBoxListaDeCursos.getSelectedItem();
    }
    
    void llenarPlanDeCurso() {
       String actividadesPorRealizar = jTextAreaActividadesPorRealizar.getText();
       String actividadesRealizadas = jTextAreaActividadesRealizadas.getText();
       String temasAbordados = jTextAreaTemasAbordados.getText();
       String temasPorAbordar = jTextAreaTemasPorVer.getText();
       String fechaDelAvance = jTextFieldFecha.getText();
       String porcentajeAvance = jTextFieldPorcentajeAvance.getText();
       avanceDeCurso = new AvanceDeCurso(actividadesPorRealizar, actividadesRealizadas, fechaDelAvance, porcentajeAvance, temasAbordados, temasPorAbordar, id_plan);
    }
    
    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarAvanceDeCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrarPlan;
    private javax.swing.JLabel jLabelActividadesPorRealizar;
    private javax.swing.JLabel jLabelActividadesRealizadas;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelPorcentajeDeAvance;
    private javax.swing.JLabel jLabelSeccionesAvanceDeCurso;
    private javax.swing.JLabel jLabelTemasAbordados;
    private javax.swing.JLabel jLabelTemasPorVer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaActividadesPorRealizar;
    private javax.swing.JTextArea jTextAreaActividadesRealizadas;
    private javax.swing.JTextArea jTextAreaTemasAbordados;
    private javax.swing.JTextArea jTextAreaTemasPorVer;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldPorcentajeAvance;
    // End of variables declaration//GEN-END:variables
}
