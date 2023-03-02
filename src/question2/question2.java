package question2;

public class question2 {
    public static void main(String[] args) {
        try {
            // code that might throw an exception
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // catch block to handle the ArithmeticException
            System.out.println("Cannot divide by 0 !");
        } catch (Exception e) {
            // catch block to handle any other type of exception
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            // finally block to0 execute code after try and catch blocks
            System.out.println("This code will always work");
        }
    }
}
