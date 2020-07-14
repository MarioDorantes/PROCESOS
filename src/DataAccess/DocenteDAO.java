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
    
    public DocenteDAO () {
        connectDB = new ConnectDB();
    }

    @Override
    public void guardarDocente(String numPersonal, String nombre, String apellidoMaterno, String apellidoPaterno, String rfc, String curp, String sexo, String correo, String contraseña) throws SQLException, ClassNotFoundException {
        connection = connectDB.getConnection();
        String query = "INSERT INTO docente (numPersonal, nombre, apellidoMaterno, apellidoPaterno, rfc, curp, sexo, correo, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, numPersonal);
        statement.setString(2, nombre);
        statement.setString(3, apellidoMaterno);
        statement.setString(4, apellidoPaterno);
        statement.setString(5, rfc);
        statement.setString(6, curp);
        statement.setString(7, sexo);
        statement.setString(8, correo);
        statement.setString(9, contraseña);
        
        statement.executeQuery();
    }
    
    
    
    
}
