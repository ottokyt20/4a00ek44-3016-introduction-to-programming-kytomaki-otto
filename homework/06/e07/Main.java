
class Main {
    public static void main(String [] args) {
        int [] taulukko = new int[] {1, 3, 5, 7, 9 }; 
       
       laskeKeskiarvo(taulukko);  // kutsutaan metodi, ja laitetaan sulkuihin se, mitä metodi käyttää
      
    }
    
    public static void laskeKeskiarvo(int [] taulukko) {
      

        int summa = 0; 
        for(int i = 0; i < taulukko.length; i++) {    // kfor luupin avulla käydään taulukon arvoja läpi ja plussataan niitä yhteen
        summa = summa + taulukko[i];

    }
    System.out.println(summa/taulukko.length);  // jaetaam summa taulukon koolla, eli tässä tapauksessa vitosella 
    
            
        
    }
}