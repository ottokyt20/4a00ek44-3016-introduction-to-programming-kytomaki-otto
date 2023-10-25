import java.io.Console;

public class Main {
    public static void main(String[] args) {
        int summa = 0; //alustetaan summa
        int lukuAmount = 0; //alustetaan lukujen määrä keskiarvon laskemista varten
        Console c = System.console();

        while (true) {
            System.out.println("Anna kokonaisluku");
            int luku = Integer.parseInt(c.readLine());

            if (luku < 0) {           // lopetetaan kysyminen (break), kun käyttän antama luku on negatiivinen
                break;
            }

            lukuAmount=lukuAmount + 1;
            summa = summa + luku;
        }
        System.out.println();
        System.out.println("Antamiesi positiivisen lukujen keskiarvo on " + (double)summa / lukuAmount);
    }
}

