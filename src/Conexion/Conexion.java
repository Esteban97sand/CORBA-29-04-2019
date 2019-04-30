package Conexion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
/**
 *
 * @author NICOLAS
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    
        public Connection conex;
    
    public Connection conectar(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex=DriverManager.getConnection("jdbc:mysql://localhost/persona","root","");
            System.out.println("se realizó la conexión correctamente");
        } catch (Exception e) {
            System.out.println("No es Posible realizar la conexión"+e.getMessage());
        }
        return conex;
    }
    
    
}
