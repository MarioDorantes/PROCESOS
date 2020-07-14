
package InterfacesDAO;

import Dominio.AvanceDeCurso;
import java.sql.SQLException;


public interface IAvanceDeCursoDAO {
    public void saveAvanceDeCurso(AvanceDeCurso avance) throws SQLException, ClassNotFoundException;
}
