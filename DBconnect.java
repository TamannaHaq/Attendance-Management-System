import java.sql.*; 
import javax.swing.JOptionPane;

public class DBconnect {   
    
     
    public static Connection con(){
         Connection con=null;
       
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendence_ms","root","");
            
        }catch(Exception e){
            
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String args[]){
        
    }
}
