import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 
        System.out.println("Mikä on nimesi?");
        String n  = c.readLine();

        for(int k = 0; k < n.length(); k++) {
            System.out.println(n.charAt(k));
        }



        }
    }