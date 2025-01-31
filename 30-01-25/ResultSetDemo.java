
import java.sql.*;

public class ResultSetDemo{
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres", "tiger");

        // Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = stmt.executeQuery("select * from emp;");
        while (rs.next()) {
            System.out.println("Name : " + rs.getString("NAME") + ", Age : " + rs.getInt("AGE"));
            // System.out.println("Name : "+rs.getString(1)+", Age : "+rs.getInt(2));
        }
        System.out.println("-------------------------------------------------------------------------------------------------");

        while (rs.previous()) {
            System.out.println("Name : " + rs.getString("NAME") + ", Age : " + rs.getInt("AGE"));

        }
        System.out.println("-------------------------------------------------------------------------------------------------");
        
        rs.absolute(3);
        {
            System.out.println("Name : " + rs.getString("NAME") + ", Age : " + rs.getInt("AGE"));
        }

        rs.relative(-1);
        {
            System.out.println("Name : " + rs.getString("NAME") + ", Age : " + rs.getInt("AGE"));
        }

        rs.last();
        {
            System.out.println("Name : " + rs.getString("NAME") + ", Age : " + rs.getInt("AGE"));
        }

        rs.first();
        {
            System.out.println("Name : " + rs.getString("NAME") + ", Age : " + rs.getInt("AGE"));
        }

        rs.close();
    }
}
