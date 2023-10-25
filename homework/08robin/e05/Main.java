import java.io.Console;

public class Main {
    public static void main(String[] args) {
      
        String nimi = ""; // alustetaan tyhjä merkkijono (Nimi)
        
        while (nimi.length() < 2) {  // kysytään nimeä niin kauan, kun sen pituus on alle 2 merkkiä
            Console c = System.console();
            System.out.println("Anna nimi");
            nimi = c.readLine();
            }
            System.out.println("Annoit nimen: " + nimi); // kun annetaan vähintää 2 merkkiä pitkä nimi, tulostetaan se
        }
    }


