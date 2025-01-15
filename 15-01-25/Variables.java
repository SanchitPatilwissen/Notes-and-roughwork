
// class var{

// } Invalid

public class Variables {
    public static void main(String[] args) {
        // var a;
        // a = "Hi"; This is also not allowed

        var a=10; // Like auto in cpp

        System.out.println(a);

        a = 20;

        System.out.println(a);

        // a = "Hello"; This is not allowed

        System.out.println(a);

        float var = 3.14f;

        System.out.println(var);

        var arr = new int[5];


        // switch case doesn't work for float, double and boolean but works for Strings and enum

        enum Month{
            JAN,
            FEB,
            MAR,
            APR,
            MAY,
            JUN,
            JUL,
            AUG,
            SEP,
            OCT,
            NOV,
            DEC;
        }

        switch (Month.APR) {
            case JAN, FEB, MAR -> {
                System.out.println("SPRING");
            }
            case APR, MAY, JUN -> {
                System.out.println("SUMMER");
            }
            case JUL, AUG, SEP -> {
                System.out.println("MONSOON");
            }
            case OCT, NOV, DEC -> {
                System.out.println("WINTER");
            }
            default -> {
                System.out.println("Default");
            }
        }

        String weather = switch(Month.FEB){
            case JAN, FEB, MAR -> "WINTER";
            default -> "Default";
        };

        System.out.println(weather);
    }

}
