/*
 * A program to calculate all the prime factors of a user-inputted number
 * Created by Charissa Work 11/1/23
 */
package primefactorization;

import java.util.Scanner;

import java.util.ArrayList;

public class PrimeFactorization {

    public static void main(String[] args) {
        int userNumber;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program finds the prime factors of a given"
                + " number. Please input a number: ");
        userNumber = input.nextInt();
        
        //ArrayList object to hold the factors
        ArrayList<Integer> factors = new ArrayList<Integer>();
        
        //loop to find factors of number and add them to factors array
        for(int i = 2; i <= userNumber; i++){
            if(userNumber % i == 0)
                factors.add(i);
        }
        
        //determine if userNumber is prime
        if(factors.size() < 2)
            System.out.println(userNumber + " is a prime number.");
        
        else{
            
            System.out.println("These are the prime factors of " + userNumber);
            
            //loop to print out array of factors
            for(int i = 0; i < factors.size(); i++){
                if(isPrime(factors.get(i)))
                    System.out.println(factors.get(i));
            }
        }
    }
    
    /**
     * function to test if a number is prime
     * @param num number tested for primeness
     * @return true if number is prime
     */
    static boolean isPrime(int num){
        
        for(int i = 2; i<= num/2; i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
    
}
