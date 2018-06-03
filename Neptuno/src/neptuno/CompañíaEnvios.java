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

public class CompañíaEnvios 
{
    private String user;//parametro de usuario 
    private String password;//clave base de datp
    private String db;// nombre de la base de datos
    private String host;//nombre del servidor de base datos
    private String url;//indica donde se encuentra el archivo base de datos
    private Connection conn = null;//conexion
    private Statement stm;// permite guardar comandos SQL
    
    public CompañíaEnvios (String usuario, String contraseña, String bd, String servidor)
            
    {
        this.user = usuario;
        this.password = contraseña;
        this.db = bd;
        this.host = servidor;
        this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    }
    public void conectarCompañíaEnvios()
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
    public void cerrarCompañíaEnvios()
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
    public String guardarCompañíaEnvios( String idCompañíaEnvios , String NombreCompañía , String Telefono ) 
    {
        try 
        {
            stm.execute("insert into compañías_de_envíos values ('" + idCompañíaEnvios + "' , '" + NombreCompañía + "' , '" + Telefono + "')");
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(CompañíaEnvios.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo guardar");
        }
        return ("Registro Guardado");
        
    }
    public String eliminarCompañíaEnvios( String idCompañíaEnvios ) 
    {
        try 
        {
            stm.execute("DELETE FROM compañías_de_envíos WHERE idCompañíaEnvíos = '"+ idCompañíaEnvios + "' ");
            return ("Registro elmininado");
        } catch (SQLException ex) 
        {
            Logger.getLogger(CompañíaEnvios.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo eliminar");
        }
    }
    public String actualizarCompañíaEnvios(String idCompañíaEnvios , String NombreCompañía , String Telefono ) 
    {
        try {
            stm.execute("UPDATE compañías_de_envíos SET NombreCompañía = '"+ NombreCompañía +"', Teléfono = '" + Telefono + "' WHERE idCompañíaEnvíos = '"+ idCompañíaEnvios +"' ");
            return ("Registro cambiado");
        } catch (SQLException ex) {
            Logger.getLogger(CompañíaEnvios.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo cambiar");
        }
    }
    public ResultSet buscarPorId (String id) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT * FROM compañías_de_envíos where idCompañíaEnvíos like '" + id + "%' ");
        } catch (SQLException ex) 
        {
            Logger.getLogger(CompañíaEnvios.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
    public ResultSet buscarPorNombreCompañía (String NombreCompañía) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT * FROM compañías_de_envíos where NombreCompañía like '" + NombreCompañía + "%'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(CompañíaEnvios.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
}
