/* 6.2 Write a Java program to create a class VotingApp where:
●	The method checkEligibility(int age) checks if a person is eligible to vote.
●	If age < 18, explicitly throw the predefined exception IllegalArgumentException with the message "Age must be 18 or above to vote".
In the main method, test the method with different age inputs.
●	Use a try-catch-finally block to handle exceptions.
●	The finally block should always print "Validation process completed" */

public class VotingApp {

    static void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                "Age must be 18 or above to vote"
            );
        } else {
            System.out.println("Eligible for voting");
        }
    }

    public static void main(String[] args) {
        try {
            checkEligibility(14);   // invalid age
            checkEligibility(22);   // valid age but execution shifted to catch block then finally block
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}