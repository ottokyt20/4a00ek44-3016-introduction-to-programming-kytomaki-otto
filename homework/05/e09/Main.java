
class Main {

    static int a = 0;
    static int b = 0;
    static int summa = a + b;
    
    public static void main(String [] args) {
        asetaA();
        asetaB();
        laskeYhteen();
        tulosta();
    }

    public static void asetaA() {
        a = 5;
    }

    public static void asetaB() {
        b = 5;
    }

    public static void laskeYhteen() {
        summa = a + b;
    }

    public static void tulosta() {
        System.out.println(summa);
    }
}
