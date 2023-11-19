interface MyytavaTuote { // rajapinta määrittelee metodin myy
    void myy();
}

class Main {
    public static void main(String[] args) {
        EnergiaJuoma ed = new EnergiaJuoma();
        myy(ed);

        Koira spot = new Koira();
        myy(spot); //luodaan olioita ja kutsutaan metodiii

        MyytavaTuote x = new MyytavaTuote() {  // anonyymi luokka, joka toteuttaa rajapinnan, metodia kutsutaa.
            @Override
            public void myy() {
                System.out.println("anonyymi myyty");
             }
        };

        myy(x);
    }

    public static void myy(MyytavaTuote m) {  //kutsutaan ja hyväksytää myy metodi
        m.myy();
     }
} 

class EnergiaJuoma implements MyytavaTuote {
    @Override
    public void myy() {
        System.out.println("Energiajuoma myyty");
    }
}
//toteuttavat rajapinnan ja luovat omat metodinsa
class Koira implements MyytavaTuote {
    @Override
    public void myy() {
        System.out.println("Koira myyty");
    }
}
