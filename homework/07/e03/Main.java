public class Main {
    public static void main(String [] args) {
        int [][] taulukko ={{1, 3, 9}, {2, 7, 3}};
        
        for (int i = 0; i < taulukko.length; i++) { 
            for (int j = 0; j < taulukko[i].length; j++) {  
                System.out.print(taulukko[i][j]);
                }
                
                System.out.println();
        }
    }
}


// Ensimmäinen for loop käy läpi taulukon rivit ja  antaa niiden määrän.

// Toinen for loop  käy läpi jokaisen rivin arvot ja sit antaa kyseisen rivin sarakkeiden määrän.

// tokan loopin sisällä kaikki rivien sarakkeissa olevat numerot tulostetaan 

// j=sarake, i = rivi