package com.app.Geometry;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for Point 1 (x y):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        System.out.println("Enter coordinates for Point 2 (x y):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        // Display point details
        System.out.println("Point 1 details: " + p1.getDetails());
        System.out.println("Point 2 details: " + p2.getDetails());

        // Check if points are equal
        if (p1.isEqual(p2)) {
            System.out.println("Points p1 and p2 are located at the same position.");
        } else {
            System.out.println("Points p1 and p2 are located at different positions.");
            double distance = p1.calculateDistance(p2);
            System.out.println("Distance between p1 and p2: " + distance);
        }

        scanner.close();
    }
}
