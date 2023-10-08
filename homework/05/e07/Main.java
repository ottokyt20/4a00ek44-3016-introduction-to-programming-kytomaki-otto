class Main {
    public static void main(String[] args) {
       String mj =  CharAndAmount('X', 5);  //määritetään mikä merkki ja merkkien määrä
       System.out.println(mj);

    }

    public static String CharAndAmount(char merkki, int maara) {  //metodi voi ottaa vastaan näitä parametreja, merkkejä (char) ja kokonaislukuja (int)
        char [] taulukko = new char [maara];  // luodaan taulukko jonka koko on annettujen merkkien määrä (tässä tapaukses 4)
        
        for(int i=0; i<maara; i++) {
            taulukko[i] = merkki;  //asetetaan merkkejä taulukkoon niin kauan kunnes for-looppi loppuu (4 asti)
        }    
        
        return new String(taulukko);  // metodi palauttaa taulukosta luodun merkkijonon
    }
}