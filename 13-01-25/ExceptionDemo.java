import java.io.*;
import java.sql.SQLException;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 5;
        try{
            for(int i=1;i<=20;i++){
                System.out.println(i);
                int res = a/(a-i);
                if(i == 12)
                    throw new IOException();
                if(i == 15)
                    throw new NullPointerException();
                if(i == 4)
                    return;
                if(i==3)
                    System.exit(0); // Finally not executed
                if(i == 2)
                    throw new UserException("This occurs when i = 2");
            }
        }
        catch(IOException | NullPointerException e){
            System.out.println("IO exception is caught!");
        }
        catch(Exception e){
            System.out.println("Some exception occured : "+e.getMessage());
        }
        finally{
            System.out.println("Thank you!");
        }
        System.out.println("Program continues........");

        try{
            Xyz.main(args);
        }
        catch(Exception e){
            System.out.println("The exception is handled in ExceptionDemo!");
        }

        try {
            int arr[] = new int[5];
            int res = 0/arr[0];
        } catch (ArithmeticException e) { // Subclass to superclass order.
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Exception");
        }
        catch(RuntimeException e){
            System.out.println("Runtime Exception");
        }
        catch(Exception e){
            System.out.println("Normal Exception");

        }
    }    
}

class UserException extends RuntimeException{
    public UserException(){
        super();
    }

    public UserException(String s){
        super(s);
    }

    public void display(){
        System.out.println("The display() is running");
    }
}

class Xyz{
    public static void xyz() throws IOException, SQLException, UserException{ // Only checked exceptions need to be passed, unchecked exceptions are passed automatically
        int a = 50;

        for(int i=1;i<=20;i++){
            System.out.println(i);
            int res = a/(a-i);
            if(i == 150)
                throw new NullPointerException();
            if(i == 120)
                throw new IOException();
            if(i == 100)
                throw new SQLException();
            if(i == 80)
                return;
            if(i==60)
                System.exit(0); // Finally not executed
            if(i == 20)
                throw new UserException("When i is 4!");
        }
    }

    public static void main(String[] args) throws IOException, SQLException, UserException{
        try{
            xyz();
        }
        catch(Exception e){
            System.out.println("Exception handled in Xyz!");
        }
    }
}