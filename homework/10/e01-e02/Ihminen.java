public class Ihminen {

    public void nuku() {
        System.out.println("Ihminen nukkuu");
    }

    public void syo() {
        System.out.println("Ihminen syö");  //e01
    }

    public void juo() {
        System.out.println("Ihminen juo");
    }

    public void lisaanny() {
        System.out.println("Ihminen lisääntyy");
    }
}

class Ohjelmoija extends Ihminen {  //peritytyy, samat metodit kun Ihminen-luokalla + omat

    public void osallistuCyberGothDanceJuhlaan() {
        System.out.println("Ohjelmoija tanssii :D");  //e02
    }

    public void ohjelmoi() {
        System.out.println("Ohjelmoija ohjelmoi");
    }

}
