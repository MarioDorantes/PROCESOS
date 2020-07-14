/*MARIO DORANTES
**13/07/2020
*/

package GUIS;

import javax.swing.JOptionPane;

public class RegistrarPlanDeCurso extends javax.swing.JFrame {

    public RegistrarPlanDeCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Plan de Curso");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabelRegistrarPlanDeCurso = new javax.swing.JLabel();
        jComboBoxListaDeCursos = new javax.swing.JComboBox<>();
        jLabelListaDeCursos = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

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

        jLabelRegistrarPlanDeCurso.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelRegistrarPlanDeCurso.setText("Registrar Plan de Curso");
        getContentPane().add(jLabelRegistrarPlanDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jComboBoxListaDeCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxListaDeCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 350, 50));

        jLabelListaDeCursos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelListaDeCursos.setText("Lista de Cursos: ");
        getContentPane().add(jLabelListaDeCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        jButtonRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 130, 50));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 130, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        SeccionesRegistroDePlanDeCurso irASeccionesRegistroDePlanDeCurso = new SeccionesRegistroDePlanDeCurso();
        irASeccionesRegistroDePlanDeCurso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed
    
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
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxListaDeCursos;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelListaDeCursos;
    private javax.swing.JLabel jLabelRegistrarPlanDeCurso;
    // End of variables declaration//GEN-END:variables
}
