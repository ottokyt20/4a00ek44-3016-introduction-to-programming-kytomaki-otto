import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna positiivinen kokonaisluku");
        int luku = Integer.parseInt(c.readLine());

        int summa = 0;

        for(int i = 1; i <= luku; i++) {
            summa = summa +i;
        } 

        System.out.println(summa);

    }
}