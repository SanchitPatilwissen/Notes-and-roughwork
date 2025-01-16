
class Author{ // Restriction on number of authors

    private static int count = 0; 

    private Author(){

    }

    static Author getObject(){
        if(count<5){
            Author a = new Author();
            count++;
            return a;
        }
        System.out.println("Only 5 objects can be created!");
        return null;
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Author a = Author.getObject();
            System.out.println(i+" ) "+ a);
        }
        
    }    
}
