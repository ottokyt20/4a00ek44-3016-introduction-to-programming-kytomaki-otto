public class Main {
    public static void main(String[] args) {
        Koira a = new Koira();
        a.synnyta(); // Kutsutaan Koira-luokan synnyta()-metodia (periytyy Nisakas-luokasta.) // e12
        a.nuuhkiPyllyä();
        a.ääntelehdi();

        Ihminen b = new Ihminen();
        b.luoTaidetta();
        b.synnyta();
        b.ääntelehdi();
    }
}

abstract class Nisakas {
    public void synnyta() {
        System.out.println("Synnytän lapsen."); // ei käänny koska perustana muille luokille, pitää tehdä periytyviä luokkia bro
    }

    abstract void ääntelehdi(); // e13
}

class Koira extends Nisakas { // e11 ja e12
    public void nuuhkiPyllyä() {
        System.out.println("Nuuhkii toisen koiran pyllyä");
    }

    void ääntelehdi() {
        System.out.println("Hau hau");
    }
}

class Ihminen extends Nisakas {
    public void luoTaidetta() {
        System.out.println("Luo taidetta"); // e13
    }

    void ääntelehdi() {
        System.out.println("Morooo");
    }
}
