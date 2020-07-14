package DataAccess;

import Dominio.AvanceDeCurso;
import InterfacesDAO.IAvanceDeCursoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class AvanceDeCursoDAO implements IAvanceDeCursoDAO {
    private final ConnectDB connectDB;
    private Connection connection;
    private Statement consultation;
    private ResultSet results;
    
    public AvanceDeCursoDAO() {
        connectDB = new ConnectDB();
    }
    
    @Override
    public void saveAvanceDeCurso(AvanceDeCurso avance) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO avancedecurso "
                + "(actividadesPorRealizar, actividadesRealizadas, fechaDelAvance, porcentajeDeAvance, temasAbordados, temasPorAbordar) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, avance.getActividadesPorRealizar());
        statement.setString(2, avance.getActividadesRealizadas());
        statement.setDate(3, (java.sql.Date) avance.getFechaDelAvance());
        statement.setInt(4, avance.getPorcentajeDeAvance());
        statement.setString(5, avance.getTemasAbordados());
        statement.setString(6, avance.getTemasPorAbordar());
        statement.executeQuery();
    }
    
}
