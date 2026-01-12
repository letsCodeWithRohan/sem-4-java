/* 6.3 Write a Java application that defines a method average(String[] values) which:
●	Accepts an array of strings as an argument.
●	Converts each string element into a double and computes the average.
●	If any array element is null, the method should throw a NullPointerException.
●	If  any  element  is  not  a  valid  number  (e.g.,  "abc"),  it  should  throw  a NumberFormatException.
●	Include the throws clause in the method declaration.
●	In the main method, demonstrate the working of this program with valid and invalid inputs using try-catch-finally */    

public class Average {

    static void average(String[] values)
            throws NullPointerException, NumberFormatException {

        double sum = 0;

        for (String element : values) {
            if (element == null) {
                throw new NullPointerException("Null value found");
            }
            sum += Double.parseDouble(element);
        }

        double avg = sum / values.length;
        System.out.println("Average : " + avg);
    }

    public static void main(String[] args) {

        String[] validInput = {"10", "20", "30"};
        String[] invalidInput = {"10", "abc", "30"};
        String[] nullInput = {"10", null, "30"};

        try {
            average(validInput);
            average(invalidInput);   // NumberFormatException
            average(nullInput);      // NullPointerException
        }
        catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        finally {
            System.out.println("Execution completed");
        }
    }
}