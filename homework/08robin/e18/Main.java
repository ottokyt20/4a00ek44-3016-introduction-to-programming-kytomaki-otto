import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console c = System.console();

        int samatLuvut = 0; //alustetaan muuttuja sille, jos arvottu ja käyttäjän luku on samat
        int[] kysytytLuvut = new int[4];
        int[] arvotutLuvut = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Anna kokonaisluku (0-9): ");
            kysytytLuvut[i] = Integer.parseInt(c.readLine()); // asetetaan kysytty luku alustettuu taulukkoon

            arvotutLuvut[i] = (int)(Math.random() * 10); //tässä kanss laitetaan kysytty luku alustettuu taulukkoon
            System.out.println("Arvottu luku: " + arvotutLuvut[i]); 

            System.out.println();

            if (kysytytLuvut[i] == arvotutLuvut[i]) {   //kasvatetaan määrää sille, jos arvottu ja käyttäjän antama luku on sama
                samatLuvut= samatLuvut + 1;
            }
        }

        if (samatLuvut == 4) {
            System.out.println("Voitto!");
        } else {
            System.out.println("Ei voittoa");
        }
    }
}

