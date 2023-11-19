class Main {
    public static void main(String[] args) {
        String text = "lintu syntyi";
        class Bird {
            public Bird() {
                
                text = "eipäs synnykään";
                System.out.println(text);
            }
        }

        // Luo linnusta olio ja tulosta viesti
        new Bird();
    }
}
