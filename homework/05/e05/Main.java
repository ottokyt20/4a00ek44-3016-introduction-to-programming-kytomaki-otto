import java.io.Console; 

class Main {
    public static void main(String[] args) {
        int summa = Laske();  // ajatellaan, että muuttujaan tallennetaan metodista saadut tiedot (kahden kysytyn luvun summa)
        System.out.println("Lukujen summa on " + summa);
    }

    public static int Laske() {
        Console c = System.console();

        System.out.println("Anna kokonaisluku");
        int luku1 = Integer.parseInt(c.readLine());

        System.out.println("Anna toinen kokonaisluku");
        int luku2 = Integer.parseInt(c.readLine());

        return luku1 + luku2;  // palautetaan käyttäjältä kysyttyjen lukujen summa
    }
}