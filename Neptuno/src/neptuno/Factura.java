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

public class Factura 
{
    private String user;//parametro de usuario 
    private String password;//clave base de datp
    private String db;// nombre de la base de datos
    private String host;//nombre del servidor de base datos
    private String url;//indica donde se encuentra el archivo base de datos
    private Connection conn = null;//conexion
    private Statement stm;// permite guardar comandos SQL
    
    public Factura(String usuario, String contraseña, String bd, String servidor)
            
    {
        this.user = usuario;
        this.password = contraseña;
        this.db = bd;
        this.host = servidor;
        this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    }
    
    public void conectarFactura()
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
    
    public void cerrarFactura()
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
    
    public int numeroFactura() throws SQLException 
    {
        int numeroFactura = 0;
        ResultSet rsNumeroFactura = null;
        rsNumeroFactura = stm.executeQuery("select max(idPedido) from pedidos");
        
        while(rsNumeroFactura.next())
        {
            numeroFactura = Integer.parseInt(rsNumeroFactura.getObject(1).toString()) + 1;
        }
        
        return numeroFactura;
    }
    
     public ResultSet cargarCliente()
    {
        try 
        {
            return stm.executeQuery("select nombreCompañía from clientes");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public ResultSet cargarId()
    {
        try 
        {
            return stm.executeQuery("select IdProducto from productos");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public ResultSet consultarDireccion(String nombre)
    {
        try 
        {
            return stm.executeQuery("select Dirección from clientes where nombreCompañía = '" + nombre + "'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public ResultSet consultarTelefono(String nombre)
    {
        try 
        {
            return stm.executeQuery("select Teléfono from clientes where nombreCompañía = '" + nombre + "'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public ResultSet consultarNombre(String IdProducto)
    {
        try 
        {
            return stm.executeQuery("select NombreProducto from productos where IdProducto = '" + IdProducto + "'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public ResultSet consultarPrecio(String IdProducto)
    {
        try 
        {
            return stm.executeQuery("select PrecioUnidad from productos where IdProducto = '" + IdProducto + "'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public ResultSet consultarCliente (String nombrecompañía)
    {
        try 
        {
            return stm.executeQuery("select IdCliente from clientes where nombreCompañía = '" + nombrecompañía + "'");
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
      public String guardaPedido( String idPedido , String idCliente , String idEmpleado , String fechapedido ) 
    {
        try 
        {
            stm.execute("insert into pedidos (idCliente , idempleado , fechapedido) values ('" + idCliente + "' , '" + idEmpleado + "' , '" + fechapedido + "' ) " );
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo guardar");
        }
        return ("Registro Guardado");
        
    }
      
      public String guardaDetalleDePedido( String idPedido , String idProducto , String Cantidad , String precio , String descuento ) 
    {
        try 
        {
            stm.execute("insert into detalles_de_pedidos (IdProducto , cantidad , precio , descuento ) values ('" + idPedido + "' , '" + idProducto + "' , '" + Cantidad + "' , '" + precio + "' , '" + descuento + "' ) ");
            
        } catch (SQLException ex) 
        {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE , null , ex);
            return ("No se pudo guardar");
        }
        return ("Registro Guardado");
        
    }
   
    
}
