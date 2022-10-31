/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataccess;

import java.sql.*;

public class DButil {
    public static void closePreparedStatement(Statement ps){
        try {
            if(ps != null){
                ps.close();
                
            }
            
        }catch(SQLException e){
            
            System.out.println(e);
            
        }
    }
}
