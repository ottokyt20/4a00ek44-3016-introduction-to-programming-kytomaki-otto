import java.io.Console;  

public class Main {
    public static void main(String [] args) {
        Console c = System.console(); 
        System.out.println("Mikä on nimesi?");
        String nimi  = c.readLine();


        char a = nimi.charAt(0);

        for(int i =  nimi.length()-1 ; i >= 0; i--) {
            System.out.println(nimi.charAt(i));
            }
        }
    }