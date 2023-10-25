import java.io.Console;

public class Main {
    public static void main(String[] args) {
        char[][] taulukko = {
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' }
        };

        int amountX = 0; // alustetaan X-merkkien määrä

        Console c = System.console();

        while (amountX < 3) {
            System.out.println("Anna rivi, mihin haluat merkin 'X' (ekan rivi 0 indeksi, tokan 1...):");
            int rivi = Integer.parseInt(c.readLine());

            System.out.println("Anna sarake riviltä, jonne haluat merkin 'X' (ekan sarakkeen indeksi 0, tokan 1...):");
            int sarake = Integer.parseInt(c.readLine());

            if (rivi >= 0 && rivi < 5 && sarake >= 0 && rivi < 5 && taulukko[rivi][sarake] != 'X') {  
                // erisuuri != eli jos taulukon jossain kohdassa tauluukkoo EI ole jo X
                                                                                                           
                taulukko[rivi][sarake] = 'X';
                amountX=amountX + 1;  // X merkin määrää lisätään

                System.out.println();

                for (int i = 0; i < taulukko.length; i++) {
                    for (int j = 0; j < taulukko[i].length; j++) {  // tulostetaan taulukko, jos ehdot toteutuvat
                        System.out.print(taulukko[i][j]);
                    }
                    System.out.println(); 
                }

            } else {  // jos on väärä sijainti (ehdot ei täyty siis (2 X päällekkäin, X menisi alueen ulkopuolelle)), kysytään uudelleen 
                System.out.println("Virheellinen sijainti");
            }
         }
    }
}


