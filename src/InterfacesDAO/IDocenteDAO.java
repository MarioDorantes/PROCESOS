
package InterfacesDAO;

import Dominio.Docente;
import java.sql.SQLException;


public interface IDocenteDAO {
    public void guardarDocente (String numPersonal, String nombre, String apellidoMaterno, String apellidoPaterno, String rfc, String curp, String sexo, String correo, String contraseña) throws SQLException, ClassNotFoundException;
    
}
