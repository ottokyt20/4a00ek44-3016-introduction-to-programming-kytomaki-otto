import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna rivien lukum.:");
        int rows = Integer.parseInt(c.readLine());

        System.out.println("Anna sarakkeiden lukum.:");
        int columns = Integer.parseInt(c.readLine());   // kysellään rivien ja sarakkeiden määrä käyttäjältä bro

        System.out.println();

        int[][] array = new int[rows][columns];  // Alustetaan taulukko käyttäjän antamilla arvoilla

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Anna luku sarakkeelle: ");
                array[i][j] = Integer.parseInt(c.readLine());
            
                System.out.println("Ollaan rivil " + (i + 1)); // ilmoitetaan millä rivillä ollaan, selkeyttää
                System.out.println();
            }
        }
        System.out.print("Taulukko on seuraavanlainen:");
        System.out.println();
        printTwoDimArray(array);  // Kutsutaan metodia ja annetaa sille taulukko
    }


    public static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");  // Käydään läpi rivit ja sarakkeet, metodi printtaa niiden arvot
            }
            System.out.println(); 
        }
    }
}

