/* 6.4 Write a Java program to create a Banking Application using classes and exception handling. Create a class BankAccount with:
●	A constructor to initialize the balance with 1000.00.
●	A method deposit(double amount) to add money to the account.
●	A method withdraw(double amount) that subtracts money from the account.
●	If withdrawal is more than the available balance, it should throw a custom exception called NotSufficientFundException.
In the main method:
●	Deposit 1000.00.
●	Perform three withdrawals: 400.00, 300.00, and 500.00.
●	The last withdrawal should throw the exception with the message "Not Sufficient Fund".
 */

class NotSufficientFundException extends Exception {
    public NotSufficientFundException() {
        super("Not Sufficient Fund");
    }
}

public class BankAccount {

    private double balance;

    BankAccount() {
        balance = 1000.00;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException();
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.deposit(1000.00);   // as per question

            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);   // should throw exception

        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}