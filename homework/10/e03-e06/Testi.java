public class Testi {
    public static void main(String[] args) {
        Ihminen a = new Ihminen();
        Ihminen b = new Ihminen();
        Ihminen jeppe = new Ihminen("Jeppe"); // Luodaan olioita
        Ohjelmoija pekka = new Ohjelmoija("Pekka");
        Ohjelmoija o = new Ohjelmoija("Jussi");
        Ohjelmoija koodari = new Ohjelmoija();
                                                                //määritellään aina mille oliolle kutsutaan eri metodeja
        a.setNimi("Otto"); // e03
        b.setNimi("Kalle");
        koodari.setNimi("Jamppa");

        o.setPalkka(2222); // e06
        o.setPalkka(999);
        o.setPalkka(10001);

        a.lisaanny();
        b.juo();
        a.nuku();

        o.osallistuCyberGothDanceJuhlaan(); 
        o.ohjelmoi();
        o.juo();
        o.nuku();

        pekka.ohjelmoi();
        pekka.juo();
        jeppe.juo();
        koodari.ohjelmoi();
     }
}
