public class Main {
    public static void main(String [] args) {
        int [][] taulukko ={{1, 2, 3, 4}, {5, 6, 7, 8}};
        
            for (int rivi = 0; rivi < taulukko.length; rivi++) { 
            for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) {  
                System.out.print(taulukko[rivi][sarake]);
                }
                
                System.out.println();
        }
    }
}

