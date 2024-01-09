/*
 * Practice to show pi to the nth decimal number, specified by user
 * Created by Charissa Work 10/08/2023
 */

package pipractice;

import java.util.Scanner;

public class PiPractice {

    public static void main(String args[]) {
        double pi = 3.1415926535;
        int places;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number between 1 and 10: ");
        places = input.nextInt();
        
        while(places < 0 || places > 10){
            System.out.println("Please enter a valid number:");
            places = input.nextInt();
        }
        
        String s1 = String.format("Here is pi up to " + places + " places: %." + places + "f", pi);
        
        System.out.println(s1);
    }
}
