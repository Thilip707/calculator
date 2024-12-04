import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your principal amount");
        double principal = scanner.nextDouble();
        System.out.println("Enter your annual interest rate");
        double interest = scanner.nextDouble();
        System.out.println("Enter your tenure in years");
        double tenure = scanner.nextDouble();
        scanner.close();
        double monthlyInterestRate = interest / 12 / 100;
        double numberOfPayments = tenure * 12;
        double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) /
                (Math.pow(1 + monthlyInterestRate, numberOfPayments) -1 );
        double totalPayment = monthlyPayment * numberOfPayments ;
        double totalInterestRate = totalPayment - principal;

        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n", totalPayment);
        System.out.printf("Total Interest: %.2f\n", totalInterestRate);

    }
}
