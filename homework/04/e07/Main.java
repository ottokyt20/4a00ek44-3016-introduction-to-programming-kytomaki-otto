class Main {
    public static void main(String [] args) {
       String [] taulukko = new String[5];

       
       taulukko[0] = "Otto";
       taulukko[1] = "Pekka";
       taulukko[2] = "Alex";
       taulukko[3] = "Lauri";
       taulukko[4] = "Pertti";
       
 for(int i = 0; i < taulukko.length; i = i +2)
       System.out.println(taulukko[i]);
    }
}  