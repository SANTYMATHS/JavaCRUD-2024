/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class CConexion {
    
    Connection conectar = null;
    
    String usuario = "root";
    String contrasenia = "Sansql66*";
    String bd = "bdusuarios";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            
            // JOptionPane.showMessageDialog(null, "Se conecto a la BD correctamente");
            
            
            
        }catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, "No se conecto a la BD correctamente");
          }
        
        return conectar;
    }
    
    
    
    public void cerrarConexion(){
    
        try {
            if (conectar != null && !conectar.isClosed()){
        
                conectar.close();
              //  JOptionPane.showMessageDialog(null, "Conexion cerrada");
    
             } 
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion");
        }
    
    }
    
}

