class Main {
    public static void main(String [] args) {
       int [] taulukko = new int[3];  

       taulukko[0] = 12;
       taulukko[1] = 99;
       taulukko[2] = 32;
       
       // tulostetaan arvot

       for(int i = 0; i < taulukko.length; i++)
       System.out.println(taulukko[i]);
    }
}