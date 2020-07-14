
package InterfacesDAO;

import Dominio.PlanDeCurso;
import java.sql.SQLException;

public interface IPlanDeCursoDAO {
    public void guardarPlanDeCurso(PlanDeCurso planDeCurso) throws SQLException, ClassNotFoundException;
}
