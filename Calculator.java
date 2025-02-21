import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("Choose Action:");
            System.out.println("1. Add");
            System.out.println("2. Mul");
            System.out.println("3. Div");
            System.out.println("4. Odd");
            System.out.println("5. Square");
            System.out.println("6. Exit");


            int choice = scanner.nextInt();

            if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }

  
            int num1; 
            int num2;
            double result;

            switch (choice) {
                case 1: 
                    System.out.println("Enter first number:");
                    num1 = scanner.nextInt();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextInt();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2: 
                    System.out.println("Enter first number:");
                    num1 = scanner.nextInt();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextInt();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 3: 
                    System.out.println("Enter first number:");
                    num1 = scanner.nextInt();
                    System.out.println("Enter second number:");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;

                case 4: 
                    System.out.println("Enter a number:");
                    num1 = scanner.nextInt();
                    if (num1 % 2 == 0) {
                        System.out.println(num1 + " is even.");
                    } else {
                        System.out.println(num1 + " is odd.");
                    }
                    break;

                case 5: 
                    System.out.println("Enter a number:");
                    num1 = scanner.nextInt();
                    result = num1 * num1;
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }

        scanner.close(); 
    }
}
