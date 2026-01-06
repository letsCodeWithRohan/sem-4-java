/* 2.2 Create an Employee class with private instance variables for employeeName (String) and employeeSalary (double). 
Implement public methods readEmployeeData() (to take input from the user) and 
displayEmployeeData() (to print the employee's name and salary). 
Demonstrate object creation and method invocation in a main method. */


import java.util.Scanner;

class Employee {
    Scanner scan = new Scanner(System.in);

    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData(){
        System.out.print("Enter Employee Name : ");
        employeeName = scan.nextLine();
        System.out.print("Enter Employee Salary : ");
        employeeSalary = scan.nextDouble();
    }

    public void displayEmployeeData(){
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee Salary : " + employeeSalary);
    }

    public static void main(String[] args){
        Employee e1,e2;
        e1 = new Employee();
        e2 = new Employee();
        e1.readEmployeeData();
        e2.readEmployeeData();
        e1.displayEmployeeData();
        e2.displayEmployeeData();
    }
}