/*
 * A program to calculate the cost it would take to tile a floor
 * Written by Charissa Work 12/24/23
 */
package costoftile;

import java.util.Scanner;

public class CostOfTile {

    public static void main(String[] args) {
        double tileCost;
        double width, height;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the cost per tile: ");
        tileCost = input.nextDouble();
        
        System.out.println("Please enter the width of the floor to tile in feet: ");
        width = input.nextDouble();
        
        System.out.println("Please enter the height of the floor to tile in feet: ");
        height = input.nextDouble();
        
        double totalArea = width * height;
        
        double totalCost = totalArea * tileCost;
        
        System.out.printf("The total cost to tile a floor that is %.2f feet wide and %.2f feet tall" +
                " is $%.2f\n", width, height, totalCost);
    }
    
}
