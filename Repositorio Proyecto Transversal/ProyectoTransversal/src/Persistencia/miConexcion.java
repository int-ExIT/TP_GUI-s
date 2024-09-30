
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
            Class.forName("org.mariadb.jdbc.Driver");
            conexcion = DriverManager.getConnection(url,usuario,password);
    return conexcion;        
    }
    
}
