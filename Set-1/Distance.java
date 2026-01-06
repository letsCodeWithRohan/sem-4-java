/* 1.1 Develop a Java program that prompts the user to enter a distance in meters. 
Your program should then convert this distance to feet (1 meter = 3.28084 feet) and display the result
formatted to two decimal places.*/

import java.util.Scanner;

class Distance {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Distance in meters : ");
        int meters = scan.nextInt();
        double distance = meters * 3.28084;
        System.out.print("Enter Distance in feets : " + distance);
        scan.close();
    }
}