import java.io.Console;  
 
 public class Main {
     public static void main(String [] args) {
         Console c = System.console(); 
         
         System.out.println("Anna taulukolle koko");
         int koko = Integer.parseInt(c.readLine());


         char [] taulukko = new char[koko]; // luodaan taulukko jonka koko on käyttäjän antama
         for(int i=0; i <taulukko.length; i++) {
            System.out.println("Anna yksittäinen merkki, esim. 'a' tai '!' ");
            char merkki = c.readLine().charAt(0);  //otetaan Stringin ensimmäinen kirjain :D
            taulukko [i] = merkki ; //Asetetaan merkkejä taulukkoon
           }
            
            System.out.println();
            System.out.println("Tässä antamasi merkit allekkain:");
            
                for(int i = 0; i < taulukko.length; i++)
                System.out.println(taulukko[i]); // tulostetaan käyttäjän antamat kerkit allekkain
            
     }
 }