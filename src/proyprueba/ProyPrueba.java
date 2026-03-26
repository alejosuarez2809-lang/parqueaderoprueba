
package proyprueba;

/**
 *
 * @author ALEJO
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyPrueba {

    
    public static void main(String[] args) {
       
        String usuario="root";
        String password="232425";
        String url="jdbc:mysql://localhost:3306/ParqueaderoPrueba";
        
        Connection conexion;
        Statement st;
        ResultSet rs;
        
        try {
            conexion =DriverManager.getConnection(url,usuario,password);
            st=conexion.createStatement();
            //select, se hizo consulta a la base de datos
            /* rs=st.executeQuery("SELECT * FROM vehiculos");
            rs.next();
            do{
            System.out.println(rs.getInt("id")+" : "+rs.getString("propietario"));
            }while(rs.next());*/
            
            //realizar la sentencia para insertar datos
            
            /*st.executeUpdate("Insert into vehiculos value(2,'acv234','pedro','campero')");
            rs=st.executeQuery("SELECT * FROM vehiculos");
            
            rs.next();
            do{
            System.out.println(rs.getInt("id")+" : "+rs.getString("propietario"));
            }while(rs.next());*/
            
            //sentencia de actualizar los datos en la base de datos
            
            /*st.executeUpdate("UPDATE vehiculos SET propietario='juan' WHERE id=2");
            System.out.println("  ");
            rs=st.executeQuery("SELECT * FROM vehiculos");
            
            rs.next();
            do{
            System.out.println(rs.getInt("id")+" : "+rs.getString("propietario"));
            }while(rs.next());*/
            
            //sentencia para eliminar los datos de la base de datos
            
            st.executeUpdate("DELETE FROM vehiculos WHERE id=2");
            System.out.println("  ");
            rs=st.executeQuery("SELECT * FROM vehiculos");
            
            rs.next();
            do{
            System.out.println(rs.getInt("id")+" : "+rs.getString("propietario"));
            }while(rs.next());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProyPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProyPrueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        
    }
    
}
