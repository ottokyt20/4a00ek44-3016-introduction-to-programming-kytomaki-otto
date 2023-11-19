class Bird {
    public void lennä() {
        System.out.println("Lintu lentää");
    }
}

class Struthioniformes extends Bird {
    @Override
    public void lennä() {
        System.out.println("Strutsi yrittää lentää");
    }
}

class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        lennä(b);

        Struthioniformes s = new Struthioniformes();
        lennä(s);

        // Anonyymi luokka metodin sisäls
        Bird x = new Bird() {
            @Override
            public void lennä() {
                System.out.println("Anonyymi lentää");
            }
        };
        x.lennä();   // Kutsutaan lennä-metodia anonyymin luokan olion kautta.
    }

    public static void lennä(Bird b) {  // Metodi lennä hyväksyy Bird-tyyppisen olion ja kutsuu sen lennä-metodia.
        b.lennä();
    }
}
