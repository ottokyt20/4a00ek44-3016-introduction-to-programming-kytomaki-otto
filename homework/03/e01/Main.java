import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 
        System.out.println("Mikä on nimesi?");
        String nimi  = c.readLine();

        if(nimi.equals("Jussi")) {
            System.out.println("Ompa sinulla tylsä nimi XD");
        
        }else {
            System.out.println("Ompa sinulla kiva nimi :)");
            }
        }
    }