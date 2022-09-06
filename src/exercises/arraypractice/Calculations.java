package exercises.arraypractice;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.ArrayList;

public class Calculations {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

}
