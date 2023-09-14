
import java.io.Console;  

public class Main  {
    public static void main(String [] args) {
        Console c = System.console();
        String nimet = "";
        String nimi = "";


        while(!nimi.equals("lopeta")) {       // !"jaska".equals("lopeta") = !false
            System.out.println("Anna nimi");
            nimi = c.readLine();

            
            nimet = nimet + nimi;  // nimet = "jaskajussikalle" + "lopeta"
            if(!nimi.equals("lopeta")){
                System.out.println(nimet);
            }   
        }
    }
}
