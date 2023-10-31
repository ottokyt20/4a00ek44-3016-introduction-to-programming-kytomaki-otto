public class TestRectangle {
   public static void main(String [] args) {
      Rectangle a = new Rectangle();

      System.out.println(a.width);
      System.out.println(a.height);  // tulostuu 0, sillä int-mutttujan oletusarvo nolla, jos ei annettu arvoja.
   }
}