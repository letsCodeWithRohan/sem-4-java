/* 1.4 Develop a Java application that calculates a person's Body Mass Index (BMI). 
The program should ask the user for their weight in pounds and height in inches. 
Convert these values to kilograms and meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and
then calculate BMI (weight in kg / (height in meters)^2). Display the calculated BMI.*/

import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        int weightInPounds = scan.nextInt();

        System.out.print("Enter height in inches: ");
        int heightInInches = scan.nextInt();

        double weightInKG = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;

        double BMI = weightInKG / Math.pow(heightInMeters, 2);

        System.out.println("BMI is : " + BMI);

        scan.close();
    }
}
