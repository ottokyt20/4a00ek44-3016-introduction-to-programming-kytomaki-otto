public class Main {
    public static void main(String[] args) {

        int[][] taulukko = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        for (int rivi = 0; rivi < taulukko.length; rivi++) { // käydään läpi jokainen rivi taulukost
            int rivinSumma = 0; // alustetaan  eri rivien lukujen summa, se on täällä että jokaiselle riville tulee oma summa
            for (int sarake = 0; sarake < taulukko[rivi].length; sarake++) { // käydään läpi sarakkeet riveiltä
                int luku = taulukko[rivi][sarake];  
                System.out.print(luku); // tulostetaan luvut tietylt rivilt
                rivinSumma = rivinSumma + luku; // muodostetaan summa rivin luvuist
            }
            System.out.println(" summa = " + rivinSumma);
        }
    }
}
