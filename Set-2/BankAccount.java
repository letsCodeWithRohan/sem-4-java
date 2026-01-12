import java.util.Scanner;

class BankAccount {

    Scanner scan = new Scanner(System.in);

    String accountId, accountHolderName;
    double balance;

    private void assignValues(){
        System.out.print("Enter Accouunt ID : ");
        accountId = scan.nextLine();
        System.out.print("Enter Accouunt Holder Name : ");
        accountHolderName = scan.nextLine();
        System.out.print("Enter Accouunt Balance : ");
        balance = scan.nextDouble();
    }

    private void displayValues(){
        System.out.println("----------- Account Details ----------");
        System.out.println("Accouunt ID : " + accountId);
        System.out.println("Accouunt Holder Name : " + accountHolderName);
        System.out.println("Accouunt Balance : " + balance);
    }

    private void searchAccount(String accId){
    }

    public static void main(String[] args){
        BankAccount[] arr  = {a1, a2, a3, a4, a5};
        for(BankAccount elm : arr ){
            elm = new BankAccount();
        }
        // a2 = new BankAccount();
        // a3 = new BankAccount();
        // a4 = new BankAccount();
        // a5 = new BankAccount();
        for(BankAccount elm : arr ){
            elm.assignValues();
        }
        // a1.assignValues();
        // a2.assignValues();
        // a3.assignValues();
        // a4.assignValues();
        // a5.assignValues();
    }
}