
package Persistencia;
import entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlumnoData {
    private Connection con= null;
    
    public AlumnoData (miConexcion conecxion){
        this.con = conexcion.buscarConexcion();
    }
}
