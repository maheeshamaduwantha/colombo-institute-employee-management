
package Interface;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Maheesha Madhuwantha
 */
public class MyConnection {
    public static Connection getConnection (){
        Connection conn = null;
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/colombo_institute_of_studies","root","");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            }
       
        return conn;
            
}
}



