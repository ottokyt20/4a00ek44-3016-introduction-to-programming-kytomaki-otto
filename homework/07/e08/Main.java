import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        System.out.println("Anna kuviolle korkeus");
        int korkeus = Integer.parseInt(c.readLine());

        char taulukko[][] = new char[korkeus][korkeus];  //kysytään korkeus ja muodostetaan taulukko sen perustella

        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < korkeus; j++) {
                if (i == 0 || i == korkeus - 1 || j == 0 || j == korkeus - 1) {
                    taulukko[i][j] = 'X';
                } else {
                    taulukko[i][j] = ' ';
                }
            }
        }

        // Tulostetaan neliö
        for (int i = 0; i < korkeus; i++) {
            for (int j = 0; j < korkeus; j++) {
                System.out.print(taulukko[i][j]);
            }
            System.out.println(); // Rivinvaihto jokaisen rivin jälkeen
        }
    }
}

