import java.io.Console;

public class Main {
    public static void main(String[] args) {
        char[][] taulukko = {   //luodaan taulukko
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' }
        };

        Console c = System.console();

        System.out.println("Anna rivi, mihin haluat merkin (ekan rivi 0 indeksi, tokan 1...):");
        int rivi = Integer.parseInt(c.readLine());

        System.out.println("Anna sarake, jonne haluat merkin (ekan sarakkeen indeksi 0, tokan 1...):");
        int sarake = Integer.parseInt(c.readLine());

        taulukko[rivi][sarake] = 'X';    //asetaan X taulukkoon käyttäjän antamien arvojen perusteel

        System.out.println();

        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {    //tulostetaan taulukko
                System.out.print(taulukko[i][j]);
            }
            System.out.println(); 
        }
    }
}
