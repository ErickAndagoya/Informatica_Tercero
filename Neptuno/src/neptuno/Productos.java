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

public class Productos 
{
    private String user;//parametro de usuario 
    private String password;//clave base de datp
    private String db;// nombre de la base de datos
    private String host;//nombre del servidor de base datos
    private String url;//indica donde se encuentra el archivo base de datos
    private Connection conn = null;//conexion
    private Statement stm;// permite guardar comandos SQL
    
    public Productos(String usuario, String contraseña, String bd, String servidor)
            
    {
        this.user = usuario;
        this.password = contraseña;
        this.db = bd;
        this.host = servidor;
        this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    }
    
    public void conectarProductos()
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
    public void cerrarProductos()
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
    public ResultSet cargarProveedores()
    {
        try 
        {
            return stm.executeQuery("select nombreCompañía from proveedores");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet consultarProveedores(String nombre)
    {
        try 
        {
            return stm.executeQuery("select idProveedor from proveedores where nombreCompañía = '" + nombre + "'");
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ResultSet cargarCategorias()
    {
        try 
        {
            return stm.executeQuery("select nombreCategoría from Categorías");
        } catch (SQLException ex) {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ResultSet consultarCategorias(String nombre)
    {
        try 
        {
            return stm.executeQuery("select idCategoría from Categorías where nombreCategoría = '" + nombre + "'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String guardarProductos( String idProducto , String NombreProducto , String IdProveedor   , String IdCategoría , String CantidadPorUnidad , String PrecioUnidad , String UnidadesEnExistencia , String UnidadesEnPedido , String NivelNuevoPedido , String Suspendido ) 
    {
        try 
        {
            stm.execute("insert into productos values ('" + idProducto + "' , '" + NombreProducto + "' , '" + IdProveedor + "' , '" + IdCategoría + "' , '" + CantidadPorUnidad + "' , '" + PrecioUnidad + "' , '" + UnidadesEnExistencia + "' , '" + UnidadesEnPedido + "' , '" + NivelNuevoPedido + "' , '" + Suspendido + "')");
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo guardar");
        }
        return ("Registro Guardado");
        
    }
    
    public String eliminarProductos( String idProducto ) 
    {
        try 
        {
            stm.execute("DELETE FROM productos WHERE idProveedor = '"+ idProducto + "' ");
            return ("Registro elmininado");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo eliminar");
        }
    }
    
    public String actualizarProductos( String idProducto , String NombreProducto , String IdCategoría , String IdProveedor , String CantidadPorUnidad , String PrecioUnidad , String UnidadesEnExistencia , String UnidadesEnPedido , String NivelNuevoPedido , String Suspendido ) 
    {
        try {
            stm.execute("UPDATE productos SET NombreProducto = '"+ NombreProducto +"', IdCategoría = '" + IdCategoría + "' ,  IdProveedor = '" + IdProveedor + "' , CantidadPorUnidad = '" + CantidadPorUnidad + "' , PrecioUnidad = '" + PrecioUnidad + "' , UnidadesEnExistencia = '" + UnidadesEnExistencia + "' , UnidadesEnPedido = '" + UnidadesEnPedido + "' , NivelNuevoPedido = '" + NivelNuevoPedido + "' , Suspendido = '" + Suspendido + "' WHERE idProducto = '"+ idProducto +"' ");
            return ("Registro cambiado");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Productos.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo cambiar");
        }
    }
    
    public ResultSet buscarPorId (String id) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT idProducto , nombreproducto , nombrecompañía , nombreCategoría , cantidadporUnidad , PrecioUnidad , UnidadesEnExistencia , UnidadesEnPedido , NivelNuevoPedido , Suspendido FROM productos , proveedores , categorías where proveedores.idProveedor = productos.idProveedor and categorías.idCategoría = productos.idCategoría and idProducto like '" + id + "%' ");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
     
     public ResultSet buscarPorNombreProducto (String NombreProducto) 
            
    {
        try 
        {
            return stm.executeQuery("SELECT idProducto , nombreproducto , nombrecompañía , nombreCategoría , cantidadporUnidad , PrecioUnidad , UnidadesEnExistencia , UnidadesEnPedido , NivelNuevoPedido , Suspendido FROM productos , proveedores , categorías where proveedores.idProveedor = productos.idProveedor and categorías.idCategoría = productos.idCategoría and NombreProducto like '" + NombreProducto + "%'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE , null , ex);
            return null;
        }
       
    }
    
}
