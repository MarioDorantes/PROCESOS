/*BRANDON TRUJILLO
**12/07/2020
*/
package GUIS;

public class VentanaPrincipalAdministrador extends javax.swing.JFrame {
    public VentanaPrincipalAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Pantalla inicial Administrador");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jButtonRegistraDirectr = new javax.swing.JButton();
        jButtonRegistrarCoordinador = new javax.swing.JButton();
        jButtonRegistrarProfesor = new javax.swing.JButton();
        jButtonAñadirCatalogo = new javax.swing.JButton();
        jButtonActualizarCatalogo = new javax.swing.JButton();
        jButtonEliminarDirector = new javax.swing.JButton();
        jButtonEliminarCoordinador = new javax.swing.JButton();
        jButtonEliminarProfesor = new javax.swing.JButton();
        jButtonCerrarSesion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitle.setText("Administrador");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jButtonRegistraDirectr.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistraDirectr.setText("Registrar Director");
        getContentPane().add(jButtonRegistraDirectr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 60));

        jButtonRegistrarCoordinador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistrarCoordinador.setText("<html><center"
            + ">Registar Coordinador");
        getContentPane().add(jButtonRegistrarCoordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 60));

        jButtonRegistrarProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonRegistrarProfesor.setText("Registrar Profesor");
        jButtonRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarProfesorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, 60));

        jButtonAñadirCatalogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAñadirCatalogo.setText("Añadir Catálogo");
        getContentPane().add(jButtonAñadirCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 200, 60));

        jButtonActualizarCatalogo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonActualizarCatalogo.setText("Actualizar Catálogo");
        getContentPane().add(jButtonActualizarCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 200, 60));

        jButtonEliminarDirector.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEliminarDirector.setText("Eliminar Director");
        getContentPane().add(jButtonEliminarDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 200, 60));

        jButtonEliminarCoordinador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEliminarCoordinador.setText("<html><center>Eliminar Coordinador");
        getContentPane().add(jButtonEliminarCoordinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 200, 60));

        jButtonEliminarProfesor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonEliminarProfesor.setText("Elimianr Profesor");
        getContentPane().add(jButtonEliminarProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 200, 60));

        jButtonCerrarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar Sesión");
        getContentPane().add(jButtonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarProfesorActionPerformed
        RegistrarProfesor irARegistrarProfesor = new RegistrarProfesor();
        irARegistrarProfesor.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarProfesorActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipalAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarCatalogo;
    private javax.swing.JButton jButtonAñadirCatalogo;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonEliminarCoordinador;
    private javax.swing.JButton jButtonEliminarDirector;
    private javax.swing.JButton jButtonEliminarProfesor;
    private javax.swing.JButton jButtonRegistraDirectr;
    private javax.swing.JButton jButtonRegistrarCoordinador;
    private javax.swing.JButton jButtonRegistrarProfesor;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitle;
    // End of variables declaration//GEN-END:variables
}
