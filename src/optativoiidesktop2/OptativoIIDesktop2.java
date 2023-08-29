/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optativoiidesktop2;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lab217-25
 */
public class OptativoIIDesktop2 {
    private static String userDB = "postgres";
    private static String passDB = "Alumno2023";
    private static String dataBase = "postgres";
    private static String url = "jdbc:postgresql://localhost:5432/"+dataBase;
            

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(url, userDB, passDB);
        } catch (SQLException ex) {
            Logger.getLogger(OptativoIIDesktop2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}