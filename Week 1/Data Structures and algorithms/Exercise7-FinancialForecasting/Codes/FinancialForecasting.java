import java.util.*;
public class FinancialForecasting {
    
//recursive function to calculate the future value of an investment
//future value=principal * (1 + rate)^years

    public static double futureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValue(principal * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double principal , rate;
        int years;
        System.out.println("Enter the principal amount:");
        Scanner sc=new Scanner(System.in);
        principal = sc.nextDouble();
        System.out.println("Enter the annual interest rate (as a decimal):");
        rate = sc.nextDouble();
        System.out.println("Enter the number of years:");
        years = sc.nextInt();

        double FutureValue = futureValue(principal, rate, years);
        System.out.printf("The future value of the investment after %d years is: %.2f%n", years, FutureValue);
        
    }
    
    
}