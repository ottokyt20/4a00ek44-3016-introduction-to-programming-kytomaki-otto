import java.io.Console;  

public class Main  {
    public static void main(String [] args) {
        Console c = System.console();

        System.out.println("Anna kokonaisluku");
        int luku1 = Integer.parseInt(c.readLine());

        System.out.println("Anna operaattori");
        String operator = c.readLine();
     
        System.out.println("Anna toinen kokonaisluku");
        int luku2 = Integer.parseInt(c.readLine());

         if(operator.equals("+")) {
            int sum =luku1 + luku2;
            System.out.println(luku1+ "+" + luku2 + " = "  + sum);
         
         } else if(operator.equals("-")){
            int erotus = luku1-luku2;
            System.out.println(luku1 + "-" +luku2 + " = " + erotus);
         } else if(operator.equals("*")){
            int tulo = luku1 * luku2;
            System.out.println(luku1 + "*" + luku2 + " = " + tulo);
         } else if(operator.equals("/")){
            double osam = (double) luku1 /luku2;
            System.out.println(luku1 + "/"+ luku2 + " = "+ osam);
         }
        
    }
}