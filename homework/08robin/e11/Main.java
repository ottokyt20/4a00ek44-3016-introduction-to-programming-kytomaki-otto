
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Montako '*' tulostetaan?");
        int amount = Integer.parseInt(c.readLine());

        printStars(amount);
    }


  /**
   * for loopin avulla tulostetaan kysytyn luvun verran tähtiä
   * @param amount kysytty luku käyttäjältä
   */

    public static void printStars(int amount) {


        for (int i = 0; i < amount; i++) {   //tulosteaan tähtii niin kauan kunnes tullaan käyttäjän antaman määrän kohalle
            System.out.print("*");
        }
    }
}







