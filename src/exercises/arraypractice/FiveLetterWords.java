package exercises.arraypractice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FiveLetterWords {
    public static void main(String[] arr) {
        Scanner scanner = new Scanner(System.in);
        int wordLength;

        System.out.println("Please enter a word length: ");
        wordLength = scanner.nextInt();
        do {
            ArrayList<String> list =
                    new ArrayList<>(Arrays.asList(
                            "Indigenous",
                            "Beautiful",
                            "Proud",
                            "Indigo",
                            "Oshun",
                            "Metu",
                            "Neter",
                            "Crown"));

            for (String word : list) {
                if (word.length() == wordLength) {
                    System.out.println(word);
                }
            }

        }while(wordLength > 0);
    }
}
