
package DataAccess;

import Dominio.PlanDeCurso;
import InterfacesDAO.IPlanDeCursoDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
        String query = "INSERT INTO plandecurso (id_plan, nombreCurso, listaTemas, listaActividades, fechaInicio, fechaFin, numeroActividades) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, planDeCurso.getId_plan());
        statement.setString(2, planDeCurso.getNombreCurso());
        statement.setString(3, planDeCurso.getListaTemas());
        statement.setString(4, planDeCurso.getListaActividades());
        statement.setDate(5, (Date) planDeCurso.getFechaInicio());
        statement.setDate(6, (Date) planDeCurso.getFechaFin());
        statement.setInt(7, planDeCurso.getNumeroActividades());
        statement.executeQuery();
    }
    
}
