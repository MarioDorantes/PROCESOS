/*MARIO DORANTES
**13/07/2020
*/

package GUIS;

import DataAccess.CursoDAO;
import DataAccess.PlanDeCursoDAO;
import Dominio.Curso;
import Dominio.PlanDeCurso;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegistrarPlanDeCurso extends javax.swing.JFrame {

    String NRC;
    Curso curso;
    PlanDeCurso planDeCurso;
    PlanDeCursoDAO planDeCursoDAO;
    
    public RegistrarPlanDeCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Plan de Curso");
        try {
            leerCursos();
        } catch (SQLException | ClassNotFoundException sqlException) {
            JOptionPane.showMessageDialog(this, "No se puede acceder a la base de datos en este momento. Intente más tarde.");
            sqlException.printStackTrace();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNombreDeActividades = new javax.swing.JTextArea();
        jButtonCancelar = new javax.swing.JButton();
        jButtonRegistrarPlan = new javax.swing.JButton();
        jScrollPaneFechasParaTemas = new javax.swing.JScrollPane();
        jTextAreaFechasParaTemas = new javax.swing.JTextArea();
        jLabelFechasParaTemas = new javax.swing.JLabel();
        jLabelNombreDeActividades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTemasDelCurso = new javax.swing.JTextArea();
        jTextFieldFechaFinDeCurso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldIDPlan = new javax.swing.JTextField();
        jLabelFechaInicioCurso = new javax.swing.JLabel();
        jLabelSeccionesRegistroPlanDeCurso = new javax.swing.JLabel();
        jLabelTemasDelCurso = new javax.swing.JLabel();
        jTextFieldFechaInicioCurso1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextAreaNombreDeActividades.setColumns(20);
        jTextAreaNombreDeActividades.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNombreDeActividades);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 320, 110));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 130, 40));

        jButtonRegistrarPlan.setBackground(new java.awt.Color(153, 255, 153));
        jButtonRegistrarPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarPlan.setText("Registrar Plan");
        jButtonRegistrarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarPlanActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 40));

        jTextAreaFechasParaTemas.setColumns(20);
        jTextAreaFechasParaTemas.setRows(5);
        jScrollPaneFechasParaTemas.setViewportView(jTextAreaFechasParaTemas);

        getContentPane().add(jScrollPaneFechasParaTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 240, 60));

        jLabelFechasParaTemas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFechasParaTemas.setText("Fechas para temas: ");
        getContentPane().add(jLabelFechasParaTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabelNombreDeActividades.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelNombreDeActividades.setText("Nombre de actividades: ");
        getContentPane().add(jLabelNombreDeActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, -1, -1));

        jTextAreaTemasDelCurso.setColumns(20);
        jTextAreaTemasDelCurso.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTemasDelCurso);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 320, 110));
        getContentPane().add(jTextFieldFechaFinDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 240, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Fecha fin de curso: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));
        getContentPane().add(jTextFieldIDPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 30));

        jLabelFechaInicioCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelFechaInicioCurso.setText("Fecha inicio de curso: ");
        getContentPane().add(jLabelFechaInicioCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabelSeccionesRegistroPlanDeCurso.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSeccionesRegistroPlanDeCurso.setText(" Registro Plan de Curso");
        getContentPane().add(jLabelSeccionesRegistroPlanDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabelTemasDelCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelTemasDelCurso.setText("Temas del curso: ");
        getContentPane().add(jLabelTemasDelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));
        getContentPane().add(jTextFieldFechaInicioCurso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("ID de Plan de Curso:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed

        int opcionSeleccionada = JOptionPane.showOptionDialog(this,"¿Seguro desea cancelar?", "Cancelar",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, botonesCancelar, botonesCancelar[0] );

        if (opcionSeleccionada == 0) {
            regresarPrincipalProfesor();
        }

    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRegistrarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarPlanActionPerformed
        llenarPlanDeCurso();
        planDeCursoDAO = new PlanDeCursoDAO();
        try {
            planDeCursoDAO.guardarPlanDeCurso(planDeCurso);
        } catch (SQLException | ClassNotFoundException sqlException) {
            JOptionPane.showMessageDialog(this, "No es posible acceder a la base de datos en este momento.");
            Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(Level.SEVERE, null, sqlException);
        } 
        JOptionPane.showMessageDialog(this, "¡Se registró el Plan de Curso correctamente!");
    }//GEN-LAST:event_jButtonRegistrarPlanActionPerformed
    
    String [] botonesCancelar = {"Si", "No"};
        
    void regresarPrincipalProfesor(){
        VentanaPrincipalProfesor regresarAProfesor = new VentanaPrincipalProfesor();
        regresarAProfesor.setVisible(true);
        dispose();
    }
    
    void leerCursos() throws SQLException, ClassNotFoundException {
        int i = 0;
        CursoDAO cursoDAO = new CursoDAO();
        String[] stringCursosIDs = null;
        ArrayList<Curso> todosLosCursos = cursoDAO.leerTodosLosCursos();
        List<String> cursosIDs = new ArrayList<>();
        while (i < todosLosCursos.size()) {
           cursosIDs.add(todosLosCursos.get(i).getNRC());
           i++;
        }
        stringCursosIDs = cursosIDs.toArray(new String[cursosIDs.size()]);
        JComboBox jComboBoxListaDeCursos = new JComboBox(stringCursosIDs);
        jComboBoxListaDeCursos.setEditable(true);
        JOptionPane.showMessageDialog(null, jComboBoxListaDeCursos, "Seleccione el NRC de su Curso", JOptionPane.QUESTION_MESSAGE);
        NRC = (String) jComboBoxListaDeCursos.getSelectedItem();
    }
    
    void llenarPlanDeCurso() {
       String id_plan = jTextFieldIDPlan.getText();
       String fechaInicio = jTextFieldIDPlan.getText();
       String fechaFin = jTextFieldIDPlan.getText();
       String fechasTemas = jTextAreaFechasParaTemas.getText();
       String nombreActividades = jTextAreaNombreDeActividades.getText();
       String temasCurso = jTextAreaTemasDelCurso.getText();
       planDeCurso = new PlanDeCurso(id_plan, fechaInicio, fechaFin, fechasTemas, temasCurso, nombreActividades, NRC);
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
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
       
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPlanDeCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrarPlan;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFechaInicioCurso;
    private javax.swing.JLabel jLabelFechasParaTemas;
    private javax.swing.JLabel jLabelNombreDeActividades;
    private javax.swing.JLabel jLabelSeccionesRegistroPlanDeCurso;
    private javax.swing.JLabel jLabelTemasDelCurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneFechasParaTemas;
    private javax.swing.JTextArea jTextAreaFechasParaTemas;
    private javax.swing.JTextArea jTextAreaNombreDeActividades;
    private javax.swing.JTextArea jTextAreaTemasDelCurso;
    private javax.swing.JTextField jTextFieldFechaFinDeCurso;
    private javax.swing.JTextField jTextFieldFechaInicioCurso1;
    private javax.swing.JTextField jTextFieldIDPlan;
    // End of variables declaration//GEN-END:variables
}
