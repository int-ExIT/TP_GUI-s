
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class miConexcion {
    private String url;
    private String usuario;
    private String password;
    
    private static Connection conexcion = null;

    public miConexcion(String url, String usr, String pass) {
        this.url = url;
        usuario = usr;
        password = pass;
    }
    
    public Connection buscarConexcion (){
        if(conexcion == null)
           try{
               Class.forName("org.mariadb.jdbc.Driver");
               conexcion = DriverManager.getConnection(url,usuario,password);
           }catch (SQLException | ClassNotFoundException ex){
               System.out.println("No se puede Conectar, Error encontrado"+ ex);
           }
    return conexcion;        
    }
    
}
