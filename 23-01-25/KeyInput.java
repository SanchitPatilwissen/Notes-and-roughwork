import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyInput {
    public static void main(String[] args) {
        try{
            InputStreamReader isr = new InputStreamReader(System.in); // To read from keyboard in bytestream format and convert into character stream and store in buffer in character format
            BufferedReader br = new BufferedReader(isr); // To read from buffer

            System.out.print("Please enter your name : ");
            String name = br.readLine();

            System.out.print("Enter your age : ");
            int age = Integer.parseInt(br.readLine());

            System.out.println("Hello "+name+" your age after 10 years will be "+(age+10));
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
