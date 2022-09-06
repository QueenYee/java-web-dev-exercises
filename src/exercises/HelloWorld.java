package exercises;//if this line declares the package where the file resides, why are we referencing the lsn1datatypes folder?
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name:");

        String name = input.nextLine();
        System.out.println("Hello " + name);
    }

}
