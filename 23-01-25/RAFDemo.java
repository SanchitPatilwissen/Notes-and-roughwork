import java.io.*;

public class RAFDemo {
    public static void main(String[] args) {
        try{
            // RandomAccessFile raf = new RandomAccessFile("notes.txt", "rw");
            // raf.seek(5);
            // System.out.println(raf.readLine());
            // raf.seek(raf.length());
            // raf.writeBytes("This is written by computer\n");

            // raf.close();

            PrintWriter pw = new PrintWriter(new FileOutputStream("abc.txt", true));
            pw.println("This file is written by Computer!");
            pw.flush();
            pw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
