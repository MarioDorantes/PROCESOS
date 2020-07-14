
package InterfacesDAO;

import Dominio.Docente;
import java.sql.SQLException;


public interface IDocenteDAO {
    public void guardarDocente (Docente docente) throws SQLException, ClassNotFoundException;
    
}
