import java.io.*;

public class IODemo {
    public static void main(String[] args){
        try{

            InputStreamReader isr = new InputStreamReader(System.in); // To read from keyboard in bytestream format and convert into character stream and store in buffer in character format
            BufferedReader br = new BufferedReader(isr);
    
            System.out.print("Enter file name : ");
            String fname = br.readLine();
    
            File f = new File(fname);
    
            if(f.exists()){
                BufferedReader fr = new BufferedReader(new FileReader(f));
                // System.out.println(fr.readLine());
                String line = null;
                while((line = fr.readLine()) != null){
                    System.out.println(line);
                }
                fr.close();
            }
            else{
                System.out.println("Sorry! the file doesn't exist.");
            }

            br.close();
            isr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
