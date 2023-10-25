 public class Main {
     public static void main(String [] args) {

        char [] taulukko = {'a', 'b', 'c', 'd'};

        for(int i= taulukko.length-1; i>=0; i--) { // taulukko.lenght -1, että saadaa oikein indeksit
            System.out.println(taulukko[i]);
        }
     }
 }
