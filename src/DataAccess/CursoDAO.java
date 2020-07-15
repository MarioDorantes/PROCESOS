package DataAccess;

import Dominio.Curso;
import Dominio.Docente;
import InterfacesDAO.ICursoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CursoDAO implements ICursoDAO {
    
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;
    
    public CursoDAO () {
        connectDB = new ConnectDB();
    }

    @Override
    public void guardarCurso(Curso curso) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO curso (nrc, nombreCurso, periodo, turno) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, curso.getNRC());
        statement.setString(2, curso.getNombre());
        statement.executeUpdate();
    }

    @Override
    public Curso leerCursoConNRC(String NRC) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        Curso curso = null;
        String query = "SELECT nrc, nombreCurso, periodo, turno  FROM curso WHERE nrc like '%?%'";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, NRC);
        results = statement.executeQuery();
        while (results.next()) {
            curso = new Curso();
            curso.setNRC(results.getString("NRC"));
            curso.setNombre(results.getString("nombre"));
            curso.setPeriodo(results.getString("periodo"));
            curso.setTurno(results.getString("turno")); 
        }
        return curso;
    }

    @Override
    public ArrayList<Curso> leerTodosLosCursos() throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        Curso curso = null;
        ArrayList<Curso> todosLosCursos = new ArrayList<Curso>();
        String query = "SELECT * FROM curso";
        PreparedStatement statement = connection.prepareStatement(query);
        results = statement.executeQuery();
        while (results.next()) {
            curso = new Curso();
            curso.setNRC(results.getString("nrc"));
            curso.setNombre(results.getString("nombreCurso"));
            curso.setPeriodo(results.getString("periodo"));
            curso.setTurno(results.getString("turno"));
            todosLosCursos.add(curso);
        }
        return todosLosCursos;
    }
    
}
