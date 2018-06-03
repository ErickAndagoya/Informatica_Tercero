/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neptuno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empleados 
{
    private String user;//parametro de usuario 
    private String password;//clave base de datp
    private String db;// nombre de la base de datos
    private String host;//nombre del servidor de base datos
    private String url;//indica donde se encuentra el archivo base de datos
    private Connection conn = null;//conexion
    private Statement stm;// permite guardar comandos SQL
    
    public Empleados(String usuario, String contraseña, String bd, String servidor)
            
    {
        this.user = usuario;
        this.password = contraseña;
        this.db = bd;
        this.host = servidor;
        this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    }
    public void conectarEmpleados()
    {
        try 
        {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null)
            {
                System.out.println("Conexión a base de datos "+url+" ... Ok");
                stm = conn.createStatement();
            }
        }  
        
        catch(SQLException ex) 
        {
            System.out.println("Problema en la conexión a la base de datos "+ url);
        }
        
        catch(ClassNotFoundException ex) 
        {
            System.out.println(ex);
        }
    }
     public void cerrarEmpleados()
    {
        try{
            if(conn !=null){
                stm.close();
                conn.close();
                System.out.println("Conexión cerrada");
            }
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }
     
     public String guardarEmpleados( String idEmpleado , String Apellidos , String Nombre , String Cargo , String Tratamiento , String FechaNacimiento , String FechaContratación , String Dirección ,  String Ciudad , String Región , String CódPostal , String País , String TelDomicilio , String Extensión , String Foto , String Notas , String Jefe ) 
    {
        try 
        {
            stm.execute("insert into empleados values ('" + idEmpleado + "' , '" + Apellidos + "' , '" + Nombre + "' , '" + Cargo + "' , '" + Tratamiento + "' , '" + FechaNacimiento + "' , '" + FechaContratación + "' , '" + Dirección + "' , '" + Ciudad + "' , '" + Región + "' , '" + CódPostal + "' , '" + País + "' , '" + TelDomicilio + "' , '" + Extensión + "' , '" + Foto + "' , '" + Notas + "' , '" + Jefe + "')");
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo guardar");
        }
        return ("Registro Guardado");
        
    }
     
     public String eliminarEmpleados( String idEmpleado ) 
    {
        try 
        {
            stm.execute("DELETE FROM Empleados WHERE idEmpleado = '"+ idEmpleado + "' ");
            return ("Registro elmininado");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo eliminar");
        }
    }
     
     public String actualizarEmpleados(String idEmpleados , String Apellidos , String Nombre , String Cargo , String Tratamiento , String FechaNacimiento , String FechaContratación , String Dirección ,  String Ciudad , String Región , String CódPostal , String País , String TelDomicilio , String Extensión , String Foto , String Notas , String Jefe) 
    {
        try {
            stm.execute("UPDATE empleados SET Apellidos = '"+ Apellidos +"', Nombre = '" + Nombre + "' , Cargo = '" + Cargo + "' , Tratamiento = '" + Tratamiento + "' , FechaNacimiento = '" + FechaNacimiento + "' , FechaContratación = '" + FechaContratación + "' , Dirección = '" + Dirección + "' , Ciudad = '" + Ciudad + "' , Región = '" + Región + "' , CódPostal = '" + CódPostal + "' , País = '" + País + "' , TelDomicilio = '" + TelDomicilio + "' , Extensión = '" + Extensión + "' , Foto = '" + Foto + "' , Notas = '" + Notas + "' , Jefe = '" + Jefe + "' WHERE idEmpleado = '"+ idEmpleados +"' ");
            return ("Registro cambiado");
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo cambiar");
        }
    }
     
     public ResultSet buscarPorId (String id) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT * FROM empleados where idEmpleado like '" + id + "%' ");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
     
     public ResultSet buscarPorFechaNacimiento (String FechaNacimiento) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT * FROM empleados where FechaNacimiento like '" + FechaNacimiento + "%'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
}
