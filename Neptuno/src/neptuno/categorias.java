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

public class categorias 
{
     private String user;//parametro de usuario 
    private String password;//clave base de datp
    private String db;// nombre de la base de datos
    private String host;//nombre del servidor de base datos
    private String url;//indica donde se encuentra el archivo base de datos
    private Connection conn = null;//conexion
    private Statement stm;// permite guardar comandos SQL
    
    
    
    public categorias(String usuario, String contraseña, String bd, String servidor)
            
    {
        this.user = usuario;
        this.password = contraseña;
        this.db = bd;
        this.host = servidor;
        this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    }
    
     public void conectarcategorias()
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
     public void cerrarcategorias()
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
     public String guardarcategorias( String idCategorias , String NombreCategoria , String Descripcion , String imagen ) 
    {
        try 
        {
            stm.execute("insert into categorías values ('" + idCategorias + "' , '" + NombreCategoria + "' , '" + Descripcion + "' , '" + imagen + "' )");
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(categorias.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo guardar");
        }
        return ("Registro Guardado");
        
    }
     public String eliminarcategorias( String idCategoria ) 
    {
        try 
        {
            stm.execute("DELETE FROM categorías WHERE idCategoría = '"+ idCategoria + "' ");
            return ("Registro elmininado");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo eliminar");
        }
    }
}
