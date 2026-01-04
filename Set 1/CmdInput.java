/* 1.8 Write a Java program that accepts two numbers as command-line arguments. 
Convert these arguments to appropriate numeric types (e.g., int or double), 
perform a simple calculation
(e.g., sum or product), and print the result to the console. */

class CmdInput {
    public static void main(String args[]){
        int sum = 0, product = 1;

        if (args.length == 0) {
            System.out.println("Please provide command-line arguments.");
            return;
        }

        for(String elm: args){
            int num = Integer.parseInt(elm);
            sum += num;
            product *= num;
        }
        System.out.println("Sum of inputs is : " + sum);
        System.out.println("Product of inputs is : " + product);
    }
}