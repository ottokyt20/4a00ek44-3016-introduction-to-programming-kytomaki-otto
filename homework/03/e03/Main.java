import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 
        System.out.println("Mikä on nimesi?");
        String nimi  = c.readLine();

        for(int kirjain = 0; kirjain < nimi.length(); kirjain++) {
            System.out.println(nimi.charAt(kirjain));
        }



        }
    }