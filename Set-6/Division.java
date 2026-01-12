/* 6.1 Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error.
 */

class Division {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage : java Division <numerator> <denominator>");
            return;
        }

        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;
            System.out.println("Answer is : " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Input Format");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (Exception e) {
            System.out.println("An Unexpected Error occurred");
        } finally {
            System.out.println("Execution completed");
        }
    }
}