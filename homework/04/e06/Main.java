class Main {
    public static void main(String [] args) {
       int [] taulukko = new int[3];  
 
       taulukko[0] = 12;
       taulukko[1] = 99;
       taulukko[2] = 32;
       
 for(int i = taulukko.length -1; i >= 0; i--)
       System.out.println(taulukko[i]);
    }
}