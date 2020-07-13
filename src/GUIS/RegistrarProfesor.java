/*BRANDON TRUJILLO
**12/07/2020
*/
package GUIS;

import LogicaDeNegocio.ValidacionesDeRegistroDeUsuario;
import javax.swing.JOptionPane;

public class RegistrarProfesor extends javax.swing.JFrame {
    public RegistrarProfesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Registrar Profesor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellidoPaterno = new javax.swing.JLabel();
        jLabelApellidoMaterno = new javax.swing.JLabel();
        jLabelRFC = new javax.swing.JLabel();
        jLabelCURP = new javax.swing.JLabel();
        jLabelNumeroDePersonal = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelContraseña = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellidoPaterno = new javax.swing.JTextField();
        jTextFieldApellidoMaterno = new javax.swing.JTextField();
        jTextFieldRFC = new javax.swing.JTextField();
        jTextFieldCURP = new javax.swing.JTextField();
        jTextFieldNumeroDePersonal = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTitulo.setText("Registrar Profesor");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNombre.setText("Nombre :");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 90, -1));

        jLabelApellidoPaterno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelApellidoPaterno.setText("Apellido Paterno :");
        getContentPane().add(jLabelApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 160, 20));

        jLabelApellidoMaterno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelApellidoMaterno.setText("Apellido Materno : ");
        getContentPane().add(jLabelApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabelRFC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelRFC.setText("RFC :");
        getContentPane().add(jLabelRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabelCURP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCURP.setText("CURP :");
        getContentPane().add(jLabelCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabelNumeroDePersonal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNumeroDePersonal.setText("Número de personal :");
        getContentPane().add(jLabelNumeroDePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabelGenero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelGenero.setText("Genero :");
        getContentPane().add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabelCorreo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCorreo.setText("Correo :");
        getContentPane().add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabelContraseña.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelContraseña.setText("Contraseña :");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 330, 30));
        getContentPane().add(jTextFieldApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 330, 30));
        getContentPane().add(jTextFieldApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 330, 30));
        getContentPane().add(jTextFieldRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 330, 30));
        getContentPane().add(jTextFieldCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 330, 30));
        getContentPane().add(jTextFieldNumeroDePersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 330, 30));
        getContentPane().add(jTextFieldGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 330, 30));
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 330, 30));
        getContentPane().add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 330, 30));

        jButtonCancelar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 100, 30));

        jButtonAceptar.setBackground(new java.awt.Color(153, 255, 153));
        jButtonAceptar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 100, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
      opcionCancelar();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    void opcionCancelar(){
         String [] botonesCancelar = {"Sí", "No"};
        int opcionSeleccionada = JOptionPane.showOptionDialog
                (this, "¿Seguro que desea cancelar?", "Cancelar Registar Profesor",
                        JOptionPane.YES_NO_CANCEL_OPTION, 
                                JOptionPane.CANCEL_OPTION, null, botonesCancelar, botonesCancelar [0]); 
        if (opcionSeleccionada == JOptionPane.YES_NO_OPTION) {
            VentanaPrincipalAdministrador regresarAAdministrador = new VentanaPrincipalAdministrador(); 
            regresarAAdministrador.setVisible(true); 
            dispose();  
        }
    }
    
    String nombreProfesor = "";
    String apellidoPaterno = "";
    String apellidoMaterno = "";
    String rfc = "";
    String curp = "";
    String numeroDePersonal = "";
    String genero = "";
    String correo = "";
    String contraseña = "";
    
    void validarCampos(){
         if(jTextFieldNombre.getText().isEmpty() && jTextFieldApellidoPaterno.getText().isEmpty()
               && jTextFieldApellidoMaterno.getText().isEmpty() && jTextFieldRFC.getText().isEmpty()
                        && jTextFieldCURP.getText().isEmpty() && jTextFieldNumeroDePersonal.getText().isEmpty()
                                && jTextFieldGenero.getText().isEmpty() && jTextFieldCorreo.getText().isEmpty()
                                        && jTextFieldContraseña.getText().isEmpty()){
                                                JOptionPane.showMessageDialog(this, "Favor de no dejar campos vacíos");  
       }else{
           nombreProfesor = jTextFieldNombre.getText();
           apellidoPaterno = jTextFieldApellidoPaterno.getText();
           apellidoMaterno = jTextFieldApellidoMaterno.getText();
           rfc = jTextFieldRFC.getText();
           curp = jTextFieldCURP.getText();
           numeroDePersonal = jTextFieldNumeroDePersonal.getText();
           genero = jTextFieldGenero.getText();
           correo = jTextFieldCorreo.getText();
           contraseña = jTextFieldContraseña.getText();
           
           ValidacionesDeRegistroDeUsuario usuario = new ValidacionesDeRegistroDeUsuario();

           if((usuario.validarNombre(nombreProfesor) == true) && (usuario.validarNombre(apellidoPaterno)==true)
                   && usuario.validarNombre(apellidoPaterno)==true && (usuario.validarRFCoCURP(rfc) == true)
                            && (usuario.validarRFCoCURP(curp)==true) && (usuario.validarNumeroDePersonal(numeroDePersonal)== true)
                                    && (usuario.validarGenero(genero)==true) && (usuario.validarCorreo(correo))
                                            && (usuario.validarContraseña(contraseña)==true)){
                                                guardarProfesor();
           }else{
               JOptionPane.showMessageDialog(this, "Información incorrecta,"
                       + "Ingrese una información válida para cada campo");
           }
       }
    }
    
    void guardarProfesor(){
        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabelApellidoMaterno;
    private javax.swing.JLabel jLabelApellidoPaterno;
    private javax.swing.JLabel jLabelCURP;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroDePersonal;
    private javax.swing.JLabel jLabelRFC;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldApellidoMaterno;
    private javax.swing.JTextField jTextFieldApellidoPaterno;
    private javax.swing.JTextField jTextFieldCURP;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNumeroDePersonal;
    private javax.swing.JTextField jTextFieldRFC;
    // End of variables declaration//GEN-END:variables
}
