import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);

    System.out.println("Welcome to Java Calculator!");
    System.out.println("Please select an operation (add, sub, mult, div)");

    String userChoic = scnr.next();
    
    int num1
    int num2;

    if (userChoice.equals("add")) {
        System.out.println("Enter the first number:");
        num1 = scnr.nextInt();
        
        System.out.println("Enter the second number:");
        num2 = scnr.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);
    }
    if (userChoice.equals("sub")) {
        System.out.println("Enter the first number:");
        num1 = scnr.nextInt();
        
        System.out.println("Enter the second number:");
        num2 = scnr.nextInt();
        
        int difference = num1 - num2;
        
        System.out.println("The difference is: " + difference);
    }
    if (userChoice.equals("mult")) {
        System.out.println("Enter the first number:");
        num1 = scnr.nextInt();
        
        System.out.println("Enter the second number:");
        num2 = scnr.nextInt();
        
        int product = num1 * num2;
        
        System.out.println("The product is: " + product);
    }
    if (userChoice.equals("div")) {
        System.out.println("Enter the first number:");
        num1 = scnr.nextInt();
       
        System.out.println("Enter the second number:");
        num2 = scnr.nextInt();

        double quotient = (double) num1 / num2;

        System.out.println("The quotient is: " + quotient);

       }

    }
}
