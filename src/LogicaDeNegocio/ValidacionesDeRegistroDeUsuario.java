/*BRANDON TRUJILLO
**12/07/2020
*/
package LogicaDeNegocio;

public class ValidacionesDeRegistroDeUsuario {
    boolean validarNombre;
    boolean validarNumeroDePersonal;
    boolean validarGenero;
    boolean validarRFCoCURP;
    boolean validarCorreo;
    boolean validarContraseña;
    
    
    public boolean validarNombre (String nombre) {
        return validarNombre= nombre.matches("^([A-ZÑ]{1}[a-zñ]+[ ]?){1,2}$");
    } 
     
    public boolean validarNumeroDePersonal(String numero){
        return validarNumeroDePersonal = numero.matches("^[0-9]{5}$"); 
    }
    
    public boolean validarGenero(String genero){
        return validarGenero = genero.matches("^[M|F|m|f]{1}[a|s|c|u|l|i|n|o|e|m]*$");
    }
    
    public boolean validarRFCoCURP (String rfc){
        return validarRFCoCURP = rfc.matches("^([A-Z][0-9]?){5,18}$");
    }
    
    public boolean validarCorreo (String correo){
        return validarCorreo = correo.matches("^[(A-Z)(a-z)(0-9)(/)(.)(#)(_)]{5,20}[@]{1}"
                + "[g|m|a|i|l|e|s|t|u|d|n|h|o|k]*[.|c|o|m|x|u|v]{3,6}$");
    }
    
    public boolean validarContraseña (String contraseña){
        return validarContraseña = contraseña.matches("[0-9]{0,}[(A-ZÑ)(a-zñ)(/)(.)(#)]{0,16}[0-9]{0,}"
                + "[(A-ZÑ)(a-zñ)(/)(.)(#)]{1,16}[0-9]{0,}[(A-ZÑ)(a-zñ)(/)(.)(#)]{0,16}"
                + "[0-9]{1,}[(A-ZÑ)(a-zñ)(/)(.)(#)]{0,16}");
    }
}
