import java.io.Console;  

 class Main {
    public static void main(String [] args) {
        Console c = System.console(); 
        
        System.out.println("Anna nimien määrä");
        int lukumäärä = Integer.parseInt(c.readLine());

        String [] taulukko = new String [lukumäärä];
        
        String pisinnimi = "";    // alustetaan pisin nimi muuttuja

        for(int i = 0; i < lukumäärä; i++) {
            System.out.println("Anna nimet");
            String nimi = (c.readLine());
            taulukko[i] =nimi;    // nimet tallennetaan paikkan i
                if(taulukko[i].length() > pisinnimi.length()) {   // käydään läpi taulukkoa, että löytyy pisin nimi (vertaillaan kirjainten määrää)
                    pisinnimi = taulukko[i];
                }
            }
            System.out.println(pisinnimi);
    }
 }  