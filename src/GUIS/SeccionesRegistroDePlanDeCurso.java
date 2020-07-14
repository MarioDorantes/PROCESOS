/*MARIO DORANTES
**13/07/2020
*/

package GUIS;

import javax.swing.JOptionPane;

public class SeccionesRegistroDePlanDeCurso extends javax.swing.JFrame {

    
    public SeccionesRegistroDePlanDeCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Secciones Registro de Plan de Curso");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSeccionesRegistroPlanDeCurso = new javax.swing.JLabel();
        jLabelFechaInicioCurso = new javax.swing.JLabel();
        jTextFieldFechaInicioCurso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFechaFinDeCurso = new javax.swing.JTextField();
        jLabelTemasDelCurso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTemasDelCurso = new javax.swing.JTextArea();
        jLabelFechasParaTemas = new javax.swing.JLabel();
        jScrollPaneFechasParaTemas = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelNombreDeActividades = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNombreDeActividades = new javax.swing.JTextArea();
        jButtonRegistrarPlan = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSeccionesRegistroPlanDeCurso.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSeccionesRegistroPlanDeCurso.setText("Secciones Registro Plan de Curso");
        getContentPane().add(jLabelSeccionesRegistroPlanDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabelFechaInicioCurso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelFechaInicioCurso.setText("Fecha inicio de curso: ");
        getContentPane().add(jLabelFechaInicioCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        getContentPane().add(jTextFieldFechaInicioCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Fecha fin de curso: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));
        getContentPane().add(jTextFieldFechaFinDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 240, 30));

        jLabelTemasDelCurso.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTemasDelCurso.setText("Temas del curso: ");
        getContentPane().add(jLabelTemasDelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        jTextAreaTemasDelCurso.setColumns(20);
        jTextAreaTemasDelCurso.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTemasDelCurso);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 320, 110));

        jLabelFechasParaTemas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelFechasParaTemas.setText("Fechas para temas: ");
        getContentPane().add(jLabelFechasParaTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPaneFechasParaTemas.setViewportView(jTextArea1);

        getContentPane().add(jScrollPaneFechasParaTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, 110));

        jLabelNombreDeActividades.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNombreDeActividades.setText("Nombre de actividades: ");
        getContentPane().add(jLabelNombreDeActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jTextAreaNombreDeActividades.setColumns(20);
        jTextAreaNombreDeActividades.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNombreDeActividades);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 320, 110));

        jButtonRegistrarPlan.setBackground(new java.awt.Color(153, 255, 153));
        jButtonRegistrarPlan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarPlan.setText("Registrar Plan");
        getContentPane().add(jButtonRegistrarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 40));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 130, 40));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String [] botonesCancelar = {"Si", "No"};
    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        int opcionSeleccionada = JOptionPane.showOptionDialog(this,"¿Seguro desea cancelar?", "Cancelar", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.CANCEL_OPTION, null, botonesCancelar, botonesCancelar[0] );
        
        if (opcionSeleccionada == 0) {
            regresarPrincipalProfesor();     
        } 
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    void regresarPrincipalProfesor(){
        VentanaPrincipalProfesor regresarAProfesor = new VentanaPrincipalProfesor();
        regresarAProfesor.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(SeccionesRegistroDePlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeccionesRegistroDePlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeccionesRegistroDePlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeccionesRegistroDePlanDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeccionesRegistroDePlanDeCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrarPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFechaInicioCurso;
    private javax.swing.JLabel jLabelFechasParaTemas;
    private javax.swing.JLabel jLabelNombreDeActividades;
    private javax.swing.JLabel jLabelSeccionesRegistroPlanDeCurso;
    private javax.swing.JLabel jLabelTemasDelCurso;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneFechasParaTemas;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaNombreDeActividades;
    private javax.swing.JTextArea jTextAreaTemasDelCurso;
    private javax.swing.JTextField jTextFieldFechaFinDeCurso;
    private javax.swing.JTextField jTextFieldFechaInicioCurso;
    // End of variables declaration//GEN-END:variables
}
