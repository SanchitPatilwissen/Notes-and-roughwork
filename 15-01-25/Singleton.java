
// Early Instantiation
// class  Principal {
//     static private final Principal p1 = new Principal(); // Object is already created.

//     private Principal(){

//     }

//     public static Principal getPrincipal(){
//         return p1;
//     }
// }

//Lazy Instantiation

final class Principal{
    static private Principal p1 = null; // Object is already created.

    private Principal(){

    }

    public static Principal getPrincipal(){
        if(p1==null)
            return new Principal();
        return p1;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Principal p1 = Principal.getPrincipal(); // Only 1 object can be created

    }    
}
