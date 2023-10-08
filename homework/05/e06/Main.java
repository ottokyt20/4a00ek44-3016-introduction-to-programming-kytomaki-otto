
class Main {
    public static void main(String[] args) {
        CharAndAmount('X', 10);
    }

    public static void CharAndAmount(char merkki, int maara) {  //määritetään minkä tyyppisiä muuttujia metodiin tallennetaan
        for(int i=0; i<maara; i++) {  // eli tulostetaan merkkiä niin kauan kun i < määrä ei pidä paikkaansa
            System.out.print(merkki); //tulostaa peräkkäin "XXXXX.."
        }
    }

}