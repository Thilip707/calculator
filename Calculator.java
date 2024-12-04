import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Multiply");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            // Check if the user entered a valid choice (1-4)
            if (choice >= 1 && choice <= 4) {
                System.out.println("Please enter first number:");
                double firstNumber = scanner.nextDouble();
                System.out.println("Please enter second number:");
                double secondNumber = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Your answer is " + (firstNumber + secondNumber));
                        break;
                    case 2:
                        System.out.println("Your answer is " + (firstNumber - secondNumber));
                        break;
                    case 3:
                        System.out.println("Your answer is " + (firstNumber * secondNumber));
                        break;
                    case 4:
                        if (secondNumber != 0) {
                            System.out.println("Your answer is " + (firstNumber / secondNumber));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice == 5) {
                exit = true;
                System.out.println("Thank you");
            } else {
                System.out.println("Invalid number. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}
