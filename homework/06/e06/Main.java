
class Main {
    public static void main(String [] args) {
         System.out.println( toista('x', itseisarvo(-3)) );
         System.out.println( toista('a', itseisarvo(4))  );
    }

     public static String toista(char a, int b) {  //metodi ottaa parametreinaan nämä, eli merkkejä ja kokonaislukuja
        String mj ="";  //alustetaan tyhjä merkkijono

        for(int i =0; i<b; i++) {
            mj=mj+a; // merkkijonoon lisätään merkkejä niin kauan kunnes looppi loppuu
        }

        return mj;  //palautetaan  merkkijono jossa char a esiintyy b (int) kertaa
        
    }
    
    public static int itseisarvo(int b) {
        return Math.abs(b);  // funktio Math.abs laskee itseisarvon, vois toteuttaa myös if ja elsen avulla

    }   
}