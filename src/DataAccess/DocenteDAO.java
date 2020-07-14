/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Dominio.Docente;
import InterfacesDAO.IDocenteDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gabrielflores
 */
public class DocenteDAO implements IDocenteDAO {
    private ConnectDB connectDB;
    private Connection connection;
    private Statement statement;
    private ResultSet results;

    @Override
    public void guardarDocente(Docente docente) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO docente (numPersonal, nombre, apellidoMaterno, apellidoPaterno, correo, fechaNacimiento, sexo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, docente.getNumPersonal());
        statement.setString(2, docente.getNombre());
        statement.setString(3, docente.getApellidoMaterno());
        statement.setString(4, docente.getApellidoPaterno());
        statement.setString(5, docente.getCorreo());
        statement.setDate(6, (Date) docente.getFechaNacimiento());
        statement.setString(7, (docente.getSexo()));
        statement.executeQuery();
    }
    
    
    
    
}
