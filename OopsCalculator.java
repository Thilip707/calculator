import java.util.Scanner;
class CalculatorOp {
    public double add(double a , double b) {
        return a + b ;
    }
    public double sub(double a , double b) {
        return a - b ;
    }
    public double multiply(double a , double b) {
        return a * b ;
    }
    public double divide(double a , double b) {
        return a / b;
    }

}
public class OopsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorOp calc = new CalculatorOp();
        boolean exit = false;
        while (!exit) {
            System.out.println("choose an option");
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
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
                        System.out.println("your answer is " + calc.add(firstNumber, secondNumber));
                        break;
                    case 2:
                        System.out.println("your answer is " + calc.sub(firstNumber, secondNumber));
                        break;
                    case 3:
                        System.out.println("your answer is" + calc.multiply(firstNumber, secondNumber));
                        break;
                    case 4:
                        System.out.println("your answer is " + calc.divide(firstNumber, secondNumber));
                        break;
                }
            } else if (choice == 5) {
                exit = true;
                System.out.println("Thank you");
            } else {
                System.out.println("Please enter valid number");
            }
        }
        scanner.close();
            }
        }
