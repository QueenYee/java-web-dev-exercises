package exercises;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        java.util.Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the rectangle length: ");
        length = input.nextInt();

        System.out.println("Enter the rectangle width: ");
        width = input.nextInt();
        input.close();
        area = length * width;


        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has a total area of " +area);

    }
}
