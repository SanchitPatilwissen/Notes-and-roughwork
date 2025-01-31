
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.*;

public class RowSetDemo {
    public static void main(String[] args) {
        try{
            // RowSetFactory rsf = RowSetProvider.newFactory();

            // JdbcRowSet rs = rsf.createJdbcRowSet(); 

            JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet(); 

            rs.setUrl("jdbc://postgresql://localhost:5432/demodb");

            rs.setUsername("postgres");

            rs.setPassword("tiger");

            rs.setCommand("select * from EMP");

            rs.execute();

            rs.addRowSetListener(new MyListner());

            rs.setCommand("select * from employee");

            rs.execute();

            while(rs.next()){
                System.out.println(rs.getInt(1));
                // Similar to Result Set.
            }

            rs.close();
        }   
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class MyListner implements RowSetListener{
    public void cursorMoved(RowSetEvent evt){
        System.out.println("---------------CURSOR MOVED----------------------");
    }

    public void rowChanged(RowSetEvent evt){
        System.out.println("---------------ROW CHANGED----------------------");
    }

    public void rowSetChanged(RowSetEvent evt){
        System.out.println("---------------ROW SET CHANGED----------------------");
    }
}
