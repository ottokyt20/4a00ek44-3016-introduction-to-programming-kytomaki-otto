public class Ihminen {
    private String nimi; //e03

    public Ihminen() {   // Parametriton, laitetaan tää että voidaan luoda olioita testi-luokassa, ilman että asetetaan niillä nimiä
        this.nimi = ""; // Alustetaan  
    }

    public Ihminen(String n) {  //parametrillinen rakennin, merkkijono asetetaan nimi-attribuutin arvoksi kun luodaan olio,  e04
        this.nimi = n;          //alunperin ei kääntnyt, koska ei ollut ohjelmointi luokas rakenninta, joka ottaisi vastaan
    }

    public void setNimi(String nimi) {  //setteri ja getteri :D
        this.nimi=nimi;
    }

    public String getNimi() {    //e03  
        return nimi;
    }    

    public void nuku() {
        System.out.println(getNimi() + " nukkuu");  //metodeja, e01
    }

    public void syo() {
        System.out.println(getNimi() + " syö");
    }

    public void juo() {
        System.out.println(getNimi() + " juo");
    }

    public void lisaanny() {
        System.out.println(getNimi() + " lisääntyy");
    }
}

class Ohjelmoija extends Ihminen {
    private int palkka;

    public Ohjelmoija() {
        super(""); 
    }


    public Ohjelmoija(String n) {
        super(n);  // e05
    }

    public void setPalkka(int pay) {
        if (pay >= 1000 && pay <= 10000) {  // ehdot eli palkan pitää olla alle tonnin ja yli kymppitonnin
            this.palkka = pay;    // Asetetaan palkka
            System.out.println("Kova palkka");
        } else {
            System.out.println("Palkan pitäisi olla 1000-10000.");
    }
}

    public int getPalkka() {  //palkka returnataan  //e06
        return palkka;
    }

    public void osallistuCyberGothDanceJuhlaan() {
        System.out.println(getNimi() + " tanssii :D"); 
    }
    //getNimi metodilla returnataan nimi, sitten tulostetaan esim. Jamppa ohjelmoi  e06
    public void ohjelmoi() {
        System.out.println(getNimi() + " ohjelmoi");
    }
}