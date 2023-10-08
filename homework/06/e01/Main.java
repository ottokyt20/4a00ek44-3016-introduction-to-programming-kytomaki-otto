import java.io.Console;  
 
 public class Main {
     public static void main(String [] args) {
         Console c = System.console(); 
         
         int [] taulukko = new int[10]; // luodaan taulukko jonka koko on 10
         
         for(int i=0; i <taulukko.length; i++) {
            System.out.println("Anna kok. luku");
            int luku = Integer.parseInt(c.readLine());  
            taulukko [i] = luku; //Asetetaan lukuja taulukkoon
           }
            
            System.out.println();
            System.out.println("Tässä antamasi luvut allekkain:");
            
                for(int i = 0; i < taulukko.length; i++)
                System.out.println(taulukko[i]); // tulostetaan käyttäjän antamat luvut allekkain
            
     }
 }