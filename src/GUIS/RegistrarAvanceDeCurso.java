/*MARIO DORANTES
**13/07/2020
*/
 
package GUIS;

import javax.swing.JOptionPane;

public class RegistrarAvanceDeCurso extends javax.swing.JFrame {

    public RegistrarAvanceDeCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Avance de Curso");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelRegistrarAvanceDeCurso = new javax.swing.JLabel();
        jLabelListaDeCursos = new javax.swing.JLabel();
        jComboBoxListaDeCursos = new javax.swing.JComboBox<>();
        jButtonRegistrarAvance = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegistrarAvanceDeCurso.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabelRegistrarAvanceDeCurso.setText("Registrar Avance de Curso");
        getContentPane().add(jLabelRegistrarAvanceDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabelListaDeCursos.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelListaDeCursos.setText("Lista de Cursos:");
        getContentPane().add(jLabelListaDeCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jComboBoxListaDeCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxListaDeCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 350, 50));

        jButtonRegistrarAvance.setBackground(new java.awt.Color(153, 255, 153));
        jButtonRegistrarAvance.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarAvance.setText("Registrar Avance");
        jButtonRegistrarAvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarAvanceActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarAvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 140, 50));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 140, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jButtonRegistrarAvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarAvanceActionPerformed
        SeccionesAvanceDeCurso irASeccionesAvanceDeCurso = new SeccionesAvanceDeCurso();
        irASeccionesAvanceDeCurso.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarAvanceActionPerformed

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
    private javax.swing.JButton jButtonRegistrarAvance;
    private javax.swing.JComboBox<String> jComboBoxListaDeCursos;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelListaDeCursos;
    private javax.swing.JLabel jLabelRegistrarAvanceDeCurso;
    // End of variables declaration//GEN-END:variables
}
