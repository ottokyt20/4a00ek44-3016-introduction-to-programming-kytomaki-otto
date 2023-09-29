import java.io.Console; 

class Main {
    public static void main(String [] args) {
        Console c = System.console();
        System.out.println("Anna nimi");  // kysytään nimeä
        String nimi  = c.readLine(); 
        tulostaJokinNimi(nimi); // kutsutaan metodi ja annetaan sile käyttäjän antama nimi
    }
    public static void tulostaJokinNimi(String nimi) {  // metodi määritelty
        System.out.print(nimi);
    }
}
