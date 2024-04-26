

package tester;

import java.util.Scanner;
import com.app.sunbeam.Point2D;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many points to plot:");
        int numPoints = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Point2D[] points = new Point2D[numPoints];

        // Prompt user for x & y coordinates and store the data
        for (int i = 0; i < numPoints; i++) {
            System.out.println("Enter x coordinate for Point " + (i + 1) + ":");
            double x = scanner.nextDouble();

            System.out.println("Enter y coordinate for Point " + (i + 1) + ":");
            double y = scanner.nextDouble();

            points[i] = new Point2D(x, y);
        }

        // Menu options
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Calculate and display distance between specified points");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displaySpecificPoint(scanner, points);
                    break;
                case 2:
                    displayAllPoints(points);
                    break;
                case 3:
                    calculateAndDisplayDistance(scanner, points);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displaySpecificPoint(Scanner scanner, Point2D[] points) {
        System.out.print("Enter index of the point: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < points.length) {
            System.out.println("Details of Point " + (index + 1) + ": " + points[index].getDetails());
        } else {
            System.out.println("Invalid index. Please retry!");
        }
    }

    private static void displayAllPoints(Point2D[] points) {
        System.out.println("All Points:");
        for (int i = 0; i < points.length; i++) {
            System.out.println("Point " + (i + 1) + ": " + points[i].getDetails());
        }
    }

    private static void calculateAndDisplayDistance(Scanner scanner, Point2D[] points) {
        System.out.print("Enter index of start point: ");
        int start = scanner.nextInt();

        System.out.print("Enter index of end point: ");
        int end = scanner.nextInt();

        if (start >= 0 && start < points.length && end >= 0 && end < points.length) {
            if (!points[start].isEqual(points[end])) {
                double distance = points[start].calculateDistance(points[end]);
                System.out.println("Distance between Point " + (start + 1) + " and Point " + (end + 1) + ": " + distance);
            } else {
                System.out.println("Points are located at the same position. Distance is 0.");
            }
        } else {
            System.out.println("Invalid indices. Please retry!");
        }
    }
}
