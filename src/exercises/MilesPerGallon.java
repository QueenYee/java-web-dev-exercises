package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
//        double miles;
//        double gallons;
//        double milesPerGallon;
        java.util.Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter your miles driven: ");
        Double miles = input.nextDouble();

        System.out.println("Enter the gallons of gas consumed: ");
        Double gallons = input.nextDouble();
        input.close();

        Double milesPerGallon = miles/gallons;

        System.out.println("You are currently getting " + milesPerGallon + " miles per gallon");
    }
}