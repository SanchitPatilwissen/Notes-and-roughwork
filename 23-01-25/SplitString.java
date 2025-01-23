import java.util.StringTokenizer;

public class SplitString {
    public static void main(String[] args) {
        String s = "Raju|25|30000:Tester_9892034320|raju@gmail.com;Banglore,Karnataka";

        StringTokenizer st = new StringTokenizer(s, "|;:_");
        int cnt = st.countTokens();
        for(int i=0;i<cnt;i++){
            System.out.println(st.nextToken());
        }
    }
}
