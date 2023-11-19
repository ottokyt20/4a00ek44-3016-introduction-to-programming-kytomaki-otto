
class Bird {
    public void lennä() {
        System.out.println("lintu lentää");
    }
}

class Struthioniformes extends Bird { 
    @Override //overridaant luokan bid metodi
    public void lennä() {
        System.out.println("strutsi yrittää lentää");
    }
}

class Main {
    public static void main(String[] args) {
        Bird b = new Bird(); //luodaan olioita

        lennä(b); 

        Struthioniformes s = new Struthioniformes();

        lennä(s);
    }

    public static void lennä(Bird b) { // Metodi lennä hyväksyy Bird-tyyppisen olion ja kutsuu sen lennä-metodia.
        b.lennä();
    }
}
