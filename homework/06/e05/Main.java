
class Main {
    public static void main(String [] args) {
        System.out.println( jaa(1,1) );
        System.out.println( jaa(1,2) );
        System.out.println( jaa(2,1) );
    }

    public static double jaa(int a, int b) { // Mainissa annetaan kokonaisulukuja
        return (double)a/(double)b;   // muunnetaan int -> double, jotta saadaan desimaalit oikein
    }
}