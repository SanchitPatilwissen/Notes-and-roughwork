import java.sql.*;
import java.util.Scanner;

public class ResultSetMetaDataDemo {
    public static void main(String[] args) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres", "tiger");

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        System.out.print("Enter Table name : ");
        String table = new Scanner(System.in).next();

        ResultSet rs = stmt.executeQuery("select * from "+table+";");
        
        ResultSetMetaData rsmd = rs.getMetaData();
        int cols = rsmd.getColumnCount();

        while (rs.next()) {
            for(int i=0;i<cols;i++){
                System.out.println(rsmd.getColumnName(i+1) + " : " + rs.getString(i+1));
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
