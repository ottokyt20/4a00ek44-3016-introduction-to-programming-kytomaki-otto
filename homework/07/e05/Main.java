public class Main {
    public static void main(String [] args) {
        int [][] taulukko ={{1, 3, 9}, {2, 7, 3}};
        printTwoDimArray(taulukko);      // kutsutaan metodi ja annetaan sille taulukko
    }

    public static void printTwoDimArray(int [][] taulukko) {    // metodi tulostaa siis annetun taulukon arvot
        for (int i = 0; i < taulukko.length; i++) { 
            for (int j = 0; j < taulukko[i].length; j++) {    
                System.out.print(taulukko[i][j]);  // käydään loopeissa siis läpi rivi ja sarake kerrallaan arvot, lopulta ne tulostetaan
                }
                System.out.println(); // enter rivin jälkeen
        }
    }   
}
