package com.sunbeam;

import java.util.Scanner;

//Custom Exception for negative diameter
class NegativeDiameterException extends IllegalArgumentException {
 public NegativeDiameterException() {
     super("Diameter cannot be negative");
 }
}

//Point2D class representing a point in 2D space
class Point2D {
 double x;
 double y;

 public Point2D(double x, double y) {
     this.x = x;
     this.y = y;
 }
}

//Circle class with center point and diameter
class Circle {
 private Point2D center;
 private double diameter;

 // Default constructor
 public Circle() {
     center = new Point2D(0, 0);
     diameter = 100;
 }

 // Setter method for diameter with exception handling
 public void setDiameter(double diameter) throws NegativeDiameterException {
     if (diameter < 0) {
         throw new NegativeDiameterException();
     }
     this.diameter = diameter;
 }

 // Getter methods
 public Point2D getCenter() {
     return center;
 }

 public double getDiameter() {
     return diameter;
 }
}

public class CircleExample {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     Circle circle = new Circle();
     System.out.print("Enter the diameter of the circle: ");
     double diameter = scanner.nextDouble();

     try {
         circle.setDiameter(diameter);
         System.out.println("Circle diameter set to: " + circle.getDiameter());
     } catch (NegativeDiameterException e) {
         System.out.println(e.getMessage());
     }

     scanner.close();
 }
}
