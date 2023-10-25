import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna rivien lukum. :");
        int rows = Integer.parseInt(c.readLine());

        System.out.println("Anna sarakkeiden lukum. :");
        int columns = Integer.parseInt(c.readLine());

        System.out.println();

        int[][] array = new int[rows][columns];  // alustetaan taulukko käyttäjän antamist arvoista

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Anna luku sarakkeelle; ");  // kysytään käyttäjältä luvut taulukkoon ja asetetaan niitä sinne
                array[i][j] = Integer.parseInt(c.readLine());

                
                System.out.println("Ollaan rivil " + (i + 1)); // ilmoitetaan millä rivillä ollaan, selkeyttää
                System.out.println();
            }
        }

        System.out.print("Taulukko on seuraavanlainen:");
        System.out.println();
        printTwoDimArray(array);

        System.out.println(); 

        int max = findMaxValue(array);
        System.out.println("Suurin arvo taulukossa: " + max);
    }

    public static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {   // metodi tulostaa taulukon, käydään läpi taulukkoa rivi sekä sarake kerrallaan
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
       
    }

    public static int findMaxValue(int[][] array) {
        int max = array[0][0]; //alustetaan maksimi

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {  //käydään taulukkoa läpi rivi ja sarake kerrallaan
                if (array[i][j] > max) {  //päivitetään maksimi, jos löytyy suurempi arvo kuin alustetty arvo
                    max = array[i][j];
                }
            }
        }

        return max;  //palautetaan max
    }
}
