package exercises.arraypractice;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numMix = new ArrayList<>();
        numMix.add(6);
        numMix.add(4);
        numMix.add(10);
        numMix.add(20);
        numMix.add(8);
        numMix.add(12);
        numMix.add(222);
        numMix.add(2);
        numMix.add(14);
        numMix.add(2);

        System.out.println(Calculations.sumEven(numMix));


    }
}


