 import java.io.Console;  
 
 public class Main {
     public static void main(String [] args) {
        Console c = System.console(); 
        
        System.out.println("Anna taulukolle koko");  // kysytyään taulukon koko
        int koko =Integer.parseInt(c.readLine());

         int [] taulukko = new int[koko];  //alustetaan taulukko
         int summa = 0; //alustetaan annettujen lukujen summa keskiarvon laskemista varten
         
         for(int i=0; i <taulukko.length; i++) {  //kysytään lukuja niin monta kertaa, mikä on taulukon koko
            System.out.println("Anna kok. luku");
            int luku = Integer.parseInt(c.readLine());
            taulukko [i] = luku;  // asetetaan käyttäjän antamia lukuja taulukkoon
           }
            
            System.out.println();
            
        for(int i = 0; i < taulukko.length; i++) //lisätään lukuja 10 kertaa = taulukon koko
            summa = summa + taulukko[i];  // summa on alustettu aikasemmin, lisätään siihen taulukosta lukuja 
            System.out.println("Annettujen lukujen keskiarvo on: " + summa/koko);
            
     }
 }