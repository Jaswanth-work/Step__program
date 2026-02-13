import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("--- Welcome to the Java Calculator ---");

        while (continueCalc) {
            try {
                System.out.print("\nEnter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                double result = 0;
                boolean validOperation = true;

                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            validOperation = false;
                        } else {
                            result = num1 / num2;
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        validOperation = false;
                }

                if (validOperation) {
                    System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
                }

            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter numbers.");
                scanner.next(); // Clear invalid input
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("no")) {
                continueCalc = false;
                System.out.println("Goodbye!");
            }
        }
        scanner.close();
    }
}