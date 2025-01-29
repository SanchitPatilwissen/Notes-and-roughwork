import java.sql.*;
import java.util.Scanner;

public class JdbcDemo{
    public static void main(String[] args) {
        try{
            // Class.forName("org.postgres.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/empdb", "postgres", "tiger");

            // 1) Statement
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

            // 2) Prepared Statement

            // PreparedStatement pstm = con.prepareStatement("insert into emp values (?, ?);");

            // System.out.print("Enter name : ");
            // String name = new Scanner(System.in).next();
            // System.out.print("Enter age : ");
            // int age = new Scanner(System.in).nextInt();

            // pstm.setString(1, name);
            // pstm.setInt(2, age);
            // pstm.execute();

            // stmt.close();

            // 3) Callable Statement
            // CallableStatement cstmt = con.prepareCall("CALL dummy_record()");
            // cstmt.close();


            // 4) Something used to execute batch queries
            // Statement stmt = con.createStatement();
            // stmt.addBatch("insert into emp values ('Shoyab', 22)");
            // stmt.addBatch("insert into emp values ('Sarvesh', 21)");
            // stmt.addBatch("insert into emp values ('Kaif', 31)");
            // stmt.addBatch("insert into emp values ('Omkar', 41)");

            // System.out.println("Wait for 20 seconds to see the updated table!");
            // Thread.sleep(20000);
            // stmt.executeBatch();
            // System.out.println("Database is updated");

            // stmt.close();

            // 5) Transaction purpose

            PreparedStatement pstm = con.prepareStatement("insert into emp values (?, ?);");
            con.setAutoCommit(false); // By default true so to create transactions it is used.

            for(int i=1;i<=4;i++){

                System.out.print("Enter name : ");
                String name = new Scanner(System.in).next();
                System.out.print("Enter age : ");
                int age = new Scanner(System.in).nextInt();

                pstm.setString(1, name);
                pstm.setInt(2, age);
                pstm.execute();

                if(i==2) con.rollback();

                if(i==4) con.commit();
            }
            pstm.close();

            con.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}