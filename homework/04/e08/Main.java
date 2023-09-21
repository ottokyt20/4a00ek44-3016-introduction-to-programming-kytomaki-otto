 import java.io.Console;  
 
 public class Main {
     public static void main(String [] args) {
         Console c = System.console(); 
         
         int [] taulukko = new int[10];
         int summa = 0;
         
         for(int i=0; i <taulukko.length; i++) {
            System.out.println("Anna kok. luku");
            int luku = Integer.parseInt(c.readLine());
            taulukko [i] = luku;
           }
            
            System.out.println();
            
                for(int i = 0; i < taulukko.length; i++)
                summa = summa + taulukko[i];
                System.out.println(summa);
            
     }
 }