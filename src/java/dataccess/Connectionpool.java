
package dataccess;

import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.*;

public class Connectionpool {
    private static Connectionpool pool = null;
    private static DataSource dataSource = null;
    
    
    private Connectionpool(){
        
        
        try{
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/notesdb");
                    
        }
        catch(NamingException e){
            System.out.println(e);
        }
    }
    
    public static synchronized Connectionpool getInstance(){
        
        
        if(pool == null){
            pool = new Connectionpool();
        }
        return pool;
    }
}
