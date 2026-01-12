/* 6.1 Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error.
 */

class Division {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Usage : java Division <numerator> <denominator>");
            return;
        }
        try{
            int result = Integer.parseInt(args[0]) / Integer.parseInt(args[1]);
            System.out.println("Answer is : " + result);
        } catch(NumberFormatException e){
            System.out.println("Invalid Input Format : " + e.getMessage());
        } catch(ArithmeticException e){
            System.out.println("Invalid Operation : " + e.getMessage());
        } catch(Exception e){
            System.out.println("An Unexpected Error : " + e.getMessage());
        } 
    }
}