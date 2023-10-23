public class MyMath {

    /**
     * 
     * @param number int number
     * @return true = number is positive, false = number is negative
     */
    public static boolean isPositive(int number) {
        if (number >=0) {
            return true;
        } else {
            return false;
        }
    }
}

class Main {

    public static void main(String[] args) {
     

        System.out.println(MyMath.isPositive(5));
        System.out.println(MyMath.isPositive(-2));
        System.out.println(MyMath.isPositive(0)); // neither true nor false, boolean used so...
    }
}
