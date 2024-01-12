/*
 * A program to calculate a mortage and the amount of time to pay it off
 * Written by Charissa Work 12/24/23
 */
package mortgagecalculator;

import java.util.Scanner;
import java.lang.Math;

public class MortgageCalculator {

    public static void main(String[] args) {
        double interestRate;
        int principal;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your mortgage principal: ");
        principal = input.nextInt();
        
        System.out.println("Please enter your interest rate: ");
        interestRate = input.nextDouble();
        
        int calculationResult;
        System.out.println("Enter 1 to calculate by a fixed number of years, and enter 2 to calculate " +
                                "by a monthly payment.");
        calculationResult = input.nextInt();
        
        while(calculationResult != 1 && calculationResult != 2){
            System.out.println("Please enter a 1 or a 2 to make your selection: ");
            calculationResult = input.nextInt();
        }
        
        if(calculationResult == 1){
            paymentYears(interestRate, principal);
        }
        
        else if(calculationResult == 2){
            paymentMonths();
        }
        
        
    }
    
    public static void paymentYears(double interest, int principal){
        int years;
        double monthlyPayments;
        double yearlyInterest;
        int periodicPayments;
        double periodicInterestRate;
        double discountFactor;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of years you want to pay your mortgage off in: ");
        years = input.nextInt();
        
        periodicPayments = 12 * years;
        periodicInterestRate = interest / 12;
        
        double a = Math.pow((1+ periodicInterestRate), (12 * years));
        monthlyPayments = ((principal * periodicInterestRate) * a) / (a - 1);
        
        System.out.printf("To pay off your mortgage in %d years, your monthly payments will be $%.2f\n", years, monthlyPayments);
        //System.out.println("To pay off your mortgage in " + years + " years, your monthly payments will be $"
        //                        + monthlyPayments);
    }
    
    public static void paymentMonths(){
        
    }
}
    
