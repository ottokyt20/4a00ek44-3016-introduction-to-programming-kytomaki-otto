import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console(); 
        int[][] taulukko = new int[2][3];  //määritetään taulukon koko, rivien määrä = 2 ja sarakkeiden määrä = 3

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {  // niin kauan kun "pysytään" taulukon sisällä, kysytään arvoja taulukkoon
                System.out.print("Anna luku ");
                taulukko[i][j] = Integer.parseInt(c.readLine());
            }
        }
        
        System.out.println();

        System.out.println("Taulukon arvot ovat siis:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(taulukko[i][j]);  // tulostetaan arvoja niin kauan, kun "pysytään" taulukon sisällä
            }
            System.out.println();
        }
    }
}


