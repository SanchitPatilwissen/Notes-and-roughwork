import java.sql.*;
import java.util.Scanner;

public class JdbcDemo{
    public static void main(String[] args) {
        try{
            // Class.forName("org.postgres.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres", "tiger");
            // Statement stmt = con.createStatement();
            // stmt.executeUpdate("insert into emp values ('sancho', 21);");
            // stmt.executeUpdate("update emp set age = age+1;");
            // stmt.executeUpdate("delete from emp where age<30;");


            // ResultSet rs = stmt.executeQuery("select * from emp;");
            // while(rs.next()){
            //     System.out.println("Name : "+rs.getString("NAME")+", Age : "+rs.getInt("AGE"));
            //     // System.out.println("Name : "+rs.getString(1)+", Age : "+rs.getInt(2));
            // }
            // rs.close();

            PreparedStatement pstm = con.prepareStatement("insert into emp values (?, ?);");

            System.out.print("Enter name : ");
            String name = new Scanner(System.in).next();
            System.out.print("Enter age : ");
            int age = new Scanner(System.in).nextInt();

            pstm.setString(1, name);
            pstm.setInt(2, age);
            pstm.execute();
            // stmt.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}