import java.io.Console;

public class Main {
     public static void main(String [] args) {

        Console c = System.console();

        System.out.println("Anna joku sana");
        String sana = c.readLine();
           
        
        System.out.prinln("Anna sanan alkuosan pituus");
        int luku = Integer.parseInt(c.readLine());
        

        for(int i = 0; i<luku; i++){    
         //eli niin kauan kun i < annettu luku, tulostetaan merkkijonosta merkkiä yksi kerrallaan samalle rivil
            char a = sana.charAt(i);  //charAt kasvaa, tulostaa merkkijonosta tietyn indeksin kohalta merkin
            System.out.print(a);
        }
    }
 } 