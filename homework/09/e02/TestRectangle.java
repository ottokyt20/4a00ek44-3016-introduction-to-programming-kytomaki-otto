public class TestRectangle {
   public static void main(String [] args) {
        
        Rectangle a = new Rectangle();
        Rectangle b = a; //ei uusi olio, silti tulisi vain muistipaikan osoite jos yrittää printata vaan a
    
        
        System.out.println(b);

        a.width = 10;
        a.height = 2;

        System.out.println(a.width);   
        System.out.println(a.height); 
        System.out.println(b.width);   // "10", koska b ja a osoittaa samaan olioon
        System.out.println(b.height); // "2", koska b ja a osoittaa samaan olioon
      
       
      //System.out.println(a);  antaa muistipaikan osoitteen, sama jos laittaa //System.out.println(b);
   }
}