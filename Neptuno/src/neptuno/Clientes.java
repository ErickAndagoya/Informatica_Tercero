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

/**
 *
 * @author EQÚIPO
 */
public class Clientes 
{
    private String user;//parametro de usuario 
    private String password;//clave base de datp
    private String db;// nombre de la base de datos
    private String host;//nombre del servidor de base datos
    private String url;//indica donde se encuentra el archivo base de datos
    private Connection conn = null;//conexion
    private Statement stm;// permite guardar comandos SQL
    
    
    
    public Clientes(String usuario, String contraseña, String bd, String servidor)
            
    {
        this.user = usuario;
        this.password = contraseña;
        this.db = bd;
        this.host = servidor;
        this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    }
    
     public void conectarClientes()
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
     public void cerrarClientes()
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
     public String guardarCliente( String idCliente , String NombreCompañía , String NombreContacto , String CargoContacto , String Dirección , String Ciudad , String Región , String CódPostal , String País , String Teléfono , String Fax) 
    {
        try 
        {
            stm.execute("insert into clientes values ('" + idCliente + "' , '" + NombreCompañía + "' , '" + NombreContacto + "' , '" + CargoContacto + "' , '" + Dirección + "' , '" + Ciudad + "' , '" + Región + "' , '" + CódPostal + "' , '" + País + "' , '" + Teléfono + "' , '" + Fax + "')");
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo guardar");
        }
        return ("Registro Guardado");
        
    }
     
     public String eliminarCliente( String idCl ) 
    {
        try 
        {
            stm.execute("DELETE FROM clientes WHERE idCliente = '"+ idCl + "' ");
            return ("Registro elmininado");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo eliminar");
        }
    }
     
     public String actualizarCliente(String id , String NombreCompañía , String NombreContacto , String CargoContacto , String Dirección , String Ciudad , String Región , String CódPostal , String País , String Teléfono , String Fax) 
    {
        try {
            stm.execute("UPDATE clientes SET NombreCompañía = '"+ NombreCompañía +"', NombreContacto= '"+ NombreContacto +"' ,  CargoContacto = '" + CargoContacto + "' , Dirección = '" + Dirección + "' , Ciudad = '" + Ciudad + "' , Región = '" + Región + "' , CódPostal = '" + CódPostal + "' , País = '" + País + "' , Teléfono = '" + Teléfono + "' , Fax = '"+ Fax +"' WHERE idCliente = '"+ id +"' ");
            return ("Registro cambiado");
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo cambiar");
        }
    }
     
     public ResultSet buscarPorId (String id) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT * FROM clientes where idCliente like '" + id + "%' ");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
     
     public ResultSet buscarPorNombreCompañía (String NombreCompañía) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT * FROM clientes where NombreCompañía like '" + NombreCompañía + "%'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
     
    
}
