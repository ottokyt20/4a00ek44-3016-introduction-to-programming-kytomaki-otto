public class Rectangle {
    public int height;
    public int width;

    public Rectangle(int height, int width) {
        if (height > 0 && width > 0) {
            this.height = height;
            this.width = width;
            System.out.println("Positiiviset arvot asetettu");
        } else {
            throw new IllegalArgumentException("Korkeuden ja leveyden tulee olla positiivisia lukuja.");
        }
    }
}
