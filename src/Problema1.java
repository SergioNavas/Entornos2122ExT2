public class Problema1 {

    public static boolean esMultiploDe3(Integer n) {
        n = 3;
        if (n % 2 == 0){
            System.out.println("FIzz");
        }
        return n % 2 == 0;
    }
    public static boolean esMultiploDe5(Integer n) {
        n = 5;
        if (n % 2 == 0) {
            System.out.println("Buzz");
        }
        return n % 2 == 0;
    }
    public static boolean esMultiploDe3y5(Integer n, Integer a) {
        n = 3;
        a = 5;
        if (n + a % 2 == 0) {
            System.out.println("FizzBuzz");
        }
        return n + a % 2 == 0;
    }

    public static void main(String[] args) {
        String multiplo3 = esMultiploDe3();
        String multiplo5 = esMultiploDe5();
        String multiplo3y5 = esMultiploDe3y5();

    }
}
