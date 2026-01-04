/* 1.5 Simulate a simple ATM or cashier. Given an integer amount to be dispensed (e.g., 787), 
calculate and display the minimum number of currency notes of denominations 100, 50, 10, 5, 2, and 1 
that would be given to the user.
*/

import java.util.Scanner;

class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount : ");
        int amount = scan.nextInt();

        int[] arr = {100,50,10,5,2,1};

        for(int elm : arr){
            System.out.println(elm+ " : " + (amount / elm));
            amount %= elm;
        }
    }
}