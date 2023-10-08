
class Matikka {
    public static void main(String [] args) {
         // laskee luvun itseisarvon (jos neg, muuta positiiviseksi)
         int itseisarvo = Matikka.itseisarvo(-7); 
         System.out.println(itseisarvo); // 7
   
         // Tsekkaa kumpi annetuista arvoista on suurempi
         int max = Matikka.max(10, 20);
         System.out.println(max); // 20;

         // arpoo luvun 0 - MAX, käytä Math.random() metodia toteutukseen
         int random = Matikka.random(max);
         System.out.println(random); // satunnainen luku 0 - 20
    }
    
    public static int itseisarvo(int luku) {  // vois käyttää myös Math.abs, mutta tässä kohtaa tein itse
        if (luku > 0) {
            return luku;  // jos luku on positiivinen, ei tartte tehdä mitään muunnosta
        } else {
            return -luku; // jos luku on negatiivinen, muutetaan se positiiviiseksi (- - = +) 
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;     // katotaan iffin ja elsen avulla kumpi on suurempi ja palautetaan niistä suurempi
        } else {
            return b;
        }
    }

    public static int random(int max) {
        int luku = (int) (Math.random() * max);  //max on määritelty jo aikasemmin, kerrotaan Math.random sillä niin saadaan 0-20 väli
        return luku;
    }
}
    
    
