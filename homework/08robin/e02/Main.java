import java.io.Console;

public class Main {
    public static void main(String[] args) {
        
        Console c = System.console();

        System.out.println("Anna kokonaisluku");
        int luku1 = Integer.parseInt(c.readLine());
        
        System.out.println("Anna toinen kokonaisluku");
        int luku2 = Integer.parseInt(c.readLine());

        System.out.println();

        if (luku1 + luku2 == 10) {
            System.out.println("Se oli kymppi");
        } else {
            System.out.println("Se ei ollut kymppi");
        }
    }
}