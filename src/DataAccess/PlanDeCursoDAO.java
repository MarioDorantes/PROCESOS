
package DataAccess;

import Dominio.PlanDeCurso;
import InterfacesDAO.IPlanDeCursoDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlanDeCursoDAO implements IPlanDeCursoDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;
    
    public PlanDeCursoDAO() {
        connectDB = new ConnectDB();
    }

    @Override
    public void guardarPlanDeCurso(PlanDeCurso planDeCurso) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO plan_de_curso (idPlan, temas, nombreActividades, fechaInicio, fechaFin, nrc, fechasTemas) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, planDeCurso.getId_plan());
        statement.setString(2, planDeCurso.getTemasCurso());
        statement.setString(3, planDeCurso.getNombreActividades());
        statement.setString(4, planDeCurso.getFechaInicio());
        statement.setString(5, planDeCurso.getFechaFin());
        statement.setString(6, planDeCurso.getNRC());
        statement.setString(7, planDeCurso.getFechasTemas());
        statement.executeUpdate();
    }
    
    public ArrayList<PlanDeCurso> leerTodosLosPlanesDeCurso () throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        PlanDeCurso planDeCurso = null;
        ArrayList<PlanDeCurso> todosLosPlanes = new ArrayList<PlanDeCurso>();
        String query = "SELECT idPlan from plan_de_curso";
        PreparedStatement statement = connection.prepareStatement(query);
        results = statement.executeQuery();
        while (results.next()) {
            planDeCurso = new PlanDeCurso();
            planDeCurso.setId_plan(results.getString("idPlan"));
            todosLosPlanes.add(planDeCurso);
        }
        return todosLosPlanes;
    }
    
}
