package org.launchcode.java.studios.areaofacircle;

public class Area {
    public static void main(String[] args) {
        double radius;
        java.util.Scanner input;

        input = new java.util.Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        //double result = 3.14 * radius * radius;

        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius) + ".");


    }



}
