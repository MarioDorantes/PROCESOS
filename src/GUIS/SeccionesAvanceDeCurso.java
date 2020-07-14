/*MARIO DORANTES
**13/07/2020
*/

package GUIS;

import javax.swing.JOptionPane;

public class SeccionesAvanceDeCurso extends javax.swing.JFrame {

    public SeccionesAvanceDeCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Secciones Avance de Curso");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSeccionesAvanceDeCurso = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTemasAbordados = new javax.swing.JLabel();
        jLabelTemasPorVer = new javax.swing.JLabel();
        jLabelActividadesRealizadas = new javax.swing.JLabel();
        jLabelActividadesPorRealizar = new javax.swing.JLabel();
        jLabelPorcentajeDeAvance = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldPorcentajeAvance = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTemasAbordados = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaActividadesRealizadas = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaTemasPorVer = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaActividadesPorRealizar = new javax.swing.JTextArea();
        jButtonRegistrarAvanceDelCurso = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSeccionesAvanceDeCurso.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelSeccionesAvanceDeCurso.setText("Secciones Avance de Curso");
        getContentPane().add(jLabelSeccionesAvanceDeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabelFecha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelFecha.setText("Fecha: ");
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabelTemasAbordados.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTemasAbordados.setText("Temas abordados:");
        getContentPane().add(jLabelTemasAbordados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabelTemasPorVer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTemasPorVer.setText("Temas por ver:");
        getContentPane().add(jLabelTemasPorVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jLabelActividadesRealizadas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelActividadesRealizadas.setText("Actividades realizadas: ");
        getContentPane().add(jLabelActividadesRealizadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabelActividadesPorRealizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelActividadesPorRealizar.setText("Actividades por realizar: ");
        getContentPane().add(jLabelActividadesPorRealizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jLabelPorcentajeDeAvance.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelPorcentajeDeAvance.setText("Porcentaje de avance:");
        getContentPane().add(jLabelPorcentajeDeAvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));
        getContentPane().add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 210, 30));
        getContentPane().add(jTextFieldPorcentajeAvance, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 80, 30));

        jTextAreaTemasAbordados.setColumns(20);
        jTextAreaTemasAbordados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTemasAbordados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 100));

        jTextAreaActividadesRealizadas.setColumns(20);
        jTextAreaActividadesRealizadas.setRows(5);
        jScrollPane2.setViewportView(jTextAreaActividadesRealizadas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 280, 100));

        jTextAreaTemasPorVer.setColumns(20);
        jTextAreaTemasPorVer.setRows(5);
        jScrollPane3.setViewportView(jTextAreaTemasPorVer);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 280, 100));

        jTextAreaActividadesPorRealizar.setColumns(20);
        jTextAreaActividadesPorRealizar.setRows(5);
        jScrollPane4.setViewportView(jTextAreaActividadesPorRealizar);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 280, 100));

        jButtonRegistrarAvanceDelCurso.setBackground(new java.awt.Color(153, 255, 153));
        jButtonRegistrarAvanceDelCurso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegistrarAvanceDelCurso.setText("<html><center>Registrar Avance del Curso");
        getContentPane().add(jButtonRegistrarAvanceDelCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 130, 50));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 130, 50));

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
            java.util.logging.Logger.getLogger(SeccionesAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeccionesAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeccionesAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeccionesAvanceDeCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeccionesAvanceDeCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrarAvanceDelCurso;
    private javax.swing.JLabel jLabelActividadesPorRealizar;
    private javax.swing.JLabel jLabelActividadesRealizadas;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFondo;
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
