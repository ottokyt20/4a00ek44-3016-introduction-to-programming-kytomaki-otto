 import java.io.Console;  
 
 public class Main {
     public static void main(String [] args) {
         Console c = System.console(); 
 
         System.out.println("Anna luku");
         int luku1 = Integer.parseInt(c.readLine());
     
         System.out.println("Anna toinen luku");
         int luku2 = Integer.parseInt(c.readLine());
         
         
         int min =0;
         int max =0;
 
         if (luku1 < luku2)
             min = luku1;
             else min =luku2;
 
         if (luku1>luku2)
             max = luku1;
             else max = luku2;
         
        for (int p = min; min <= max; min++) {
         System.out.println(min);
         
        }  
     }
 }
