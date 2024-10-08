public class Errors {
    public static void main(String[] args) {
        int numerator = 7;
        int denominator = 0;
        int result = 0;

        try{
            result = numerator / denominator;

            System.out.println("Result:" + result);
        } catch(ArithmeticException e) {
            System.out.println("Error: Division by zero is not applicable");
        } finally {
            System.out.println("Execution of the try-catch block is complete");
        }
    }
}