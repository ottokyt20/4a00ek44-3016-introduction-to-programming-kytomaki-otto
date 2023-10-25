import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna positiivinen kokonaisluku");
        int luku1 = Integer.parseInt(c.readLine());

        System.out.println("Anna positiivinen kokonaisluku");
        int luku2 = Integer.parseInt(c.readLine());

        System.out.println(); 

        for(int i = luku1; i <= luku2; i++) { 
             System.out.println(i);
                                              
        }
    }
}

 /* 
 i++ tarkoittaa i=1+1, eli muuttujaan luku1 lisätään aina 1
 ja tulostetaan kunnes ollaan luku 2 kohalla
*/ 