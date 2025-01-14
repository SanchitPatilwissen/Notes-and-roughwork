import java.util.regex.*;

public class PatternMatching {
    public static void main(String[] args) {
        String s1 = "Wissen Technology";
        String s2 = "Tech";

        Pattern p1 = Pattern.compile(s2);
        Matcher m1 = p1.matcher(s1);

        System.out.println(m1.find());
    }
}
