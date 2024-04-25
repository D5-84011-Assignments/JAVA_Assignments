package Tejas.com;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter total kilometers driven per day: ");
        double kilometersDrivenPerDay = input.nextDouble();

        System.out.print("Enter cost per liter of petrol: ");
        double costPerLiter = input.nextDouble();

        System.out.print("Enter average kilometers per liter: ");
        double avgKilometersPerLiter = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFeesPerDay = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tollsPerDay = input.nextDouble();

        // Calculate daily driving cost
        double litersUsedPerDay = kilometersDrivenPerDay / avgKilometersPerLiter;
        double costPerDay = litersUsedPerDay * costPerLiter + parkingFeesPerDay + tollsPerDay;

        // Display daily driving cost
        System.out.println("Your daily driving cost is: Rs" + costPerDay);

        input.close();
    }
}
