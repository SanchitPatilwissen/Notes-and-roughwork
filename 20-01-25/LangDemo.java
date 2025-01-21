
public class LangDemo {
    public static void main(String[] args) throws Exception {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Wait and see the magic..... in 10 seconds from now!");
        Thread.sleep(10000);
        Process p1 = rt.exec("notepad.exe");
        Thread.sleep(5000);
        Process p2 = rt.exec("calc.exe");
        Thread.sleep(5000);
        Process p3 = rt.exec("mspaint.exe");
        System.out.println("Wait for 10 seconds to see it destroy....");
        Thread.sleep(10000);
        p2.destroy();
        p3.destroy();
    }
}
