/*
 * Program to generate the Fibonacci Sequence up to a user-specified number
 * Created by Charissa Work 10/18/23
 */
package fibonaccisequence;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 1;
        int n4;
        
        int index;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input a number between 1 and 50");
        index = input.nextInt();
        
        while(index < 1 || index > 50){
            System.out.println("Invalid number. Please enter a different number");
            index = input.nextInt();
        }
        
        for(int i = 0; i < index; i++){
            n4 = n2 + n3;
            System.out.println(n1);
            n1 = n2;
            n2 = n3;
            n3 = n4;
        }
    }
    
}
