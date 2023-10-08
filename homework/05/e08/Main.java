import java.io.Console; 

public class Main {
    public static void tulosta(char merkki, int amount) {
        for(int i=0; i<amount; i++) {
            System.out.print(merkki);   // eli merkkiä tulostetaan annetun määrän (korkeuden verran)
        }
    }

    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna kuviolle korkeus");
        int korkeus = Integer.parseInt(c.readLine());   // kysytään korkeus käyttäjältä

        for (int rivi = 0; rivi < korkeus; rivi++) {  // tulee yhtä monta riviä, kuin annettu korkeus
            tulosta('X', korkeus);         // metodiin tallennetaan tulostettava merkki ja sen määrä
            System.out.println();         // rivinvaihto, muuten tulisi putkeen vain "XXXXXXXXXX...."
        }
        
    }
}
