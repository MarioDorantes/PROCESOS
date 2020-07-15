/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BRANDON TRUJILLO
 */
public class ConnectDB {
    private static String url = "jdbc:mysql://localhost:3308/CursosProcesos?serverTimezone=US/Central";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String username = "BATC";
    private static String password = "brandontrujillo17";
    private static Connection con;

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName(driverName);
        con = DriverManager.getConnection(url, username, password);
        return con;
    }

   public void closeConnection() {
       if (con != null){
           try {
               if(!con.isClosed()){
                   con.close();
               }
           }catch (SQLException exc){
               Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, exc);
           }
       }
   }
}



