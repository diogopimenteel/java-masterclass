public class Challenge {
    public static void main(String[] args) {
        double x = 20.00;
        double y = 80.00;
        double result = (x + y) * 100.00;
        double remainder = result % 40.00;
        boolean isZero = remainder == 0;

        System.out.println("Result: " + result);
        System.out.println("Remainder: " + remainder);
        System.out.println("isZero: " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }
    }
}
