/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_22_004_2019;
import Conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;


/**
 *
 * @author NICOLAS
 */

public class Persona extends PersonaApp.PersonaPOA {
private ORB orb;    
Conexion conectar = new Conexion();
Conexion Prueba = new Conexion();

    @Override
    public boolean insertarPersona(int identificacion, String nombre, String apellido, String direccion, String telefono, String email) {
    return false;
        
    }

    @Override
    public String consultarPersona(int identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean actualizarkmnjPersona(int identificacion, String nombre, String apellido, String direccion, String telefono, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(int identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPersonas() {
        String lista = "";
try{
String sentenciSql = "Select * from persona";
conectar.conectar();
Statement st = conectar.conex.createStatement();
ResultSet rs = st.executeQuery(sentenciSql);
while(rs.next()){
lista += rs.getLong(2) + " - "
+ rs.getString(3)+ " - "
+ rs.getString(4)+ " - "
+ rs.getString(5)+ " - "
+ rs.getString(6)+ " - "
+ rs.getString(7) + "\n";
}
//Se cierran los recursos.
rs.close();
conectar.conex.close();
}catch(Exception ex){
JOptionPane.showMessageDialog(null, "Ocurrio un error en el catch: " + ex.getMessage());
}
return lista;
}

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public ResultSet cargarTablaPersona() {
ResultSet resultado = null;
try {
String query = "Select identificacion,nombre,apellido from persona";
conectar.conectar();
Statement st = conectar.conex.createStatement();
resultado = st.executeQuery(query);
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, "Ocurrio un error: "+e.getMessage());
}
return resultado;
}

    @Override
    public boolean actualizarPersona(int identificacion, String nombre, String apellido, String direccion, String telefono, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
