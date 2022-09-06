package exercises.arraypractice;
import java.util.Arrays;

public class ArrayPractice {

//1.1 & 2.1
//
// public static void main (String[] args) {
//    int[] nums = {1, 1, 2, 3, 5, 8};
//    for ( int i : nums) {
//        System.out.println(i);
//    }
//}

    //2.2
//    public static void main (String[] args) {
//        int[] nums = {1, 1, 2, 3, 5, 8};
//        for ( int i : nums) {
//            if( i % 2 == 1)
//                System.out.println(i);
//        }
//    }
 //3.1 & 4.1 My Solution from online resources:
//    public static void main (String[] args) {
//        String seuss = "I would not, could not, in a box." +
//                " I would not, could not with a fox. " +
//                "I will not eat them in a house. " +
//                "I will not eat them with a mouse.";
//        String[] split = seuss.split(" ");
////        for (int i=0; i<split.length; i++)
//////            System.out.println(split[i]);
//        System.out.println(Arrays.toString(split)); //I added the Arrays.toString when before
        // I just had "split" in the parenthases.  I also commented out the loop to make my solution like the book.

// 3.1 & 4.1 Solution from the book
//
// public static void main (String[] args) {
////    String phrase = "I would not, could not, in a box. " +
////            "I would not, could not with a fox. " +
////            "I will not eat them in a house. " +
////            "I will not eat them with a mouse.";
////    String[] words = phrase.split(" ");
////System.out.println(Arrays.toString(words));


        //5.1

        public static void main (String[]args){
            String phrase = "I would not, could not, in a box. " +
                    "I would not, could not with a fox. " +
                    "I will not eat them in a house. " +
                    "I will not eat them with a mouse.";
            String[] words = phrase.split(" \\.");
            System.out.println(Arrays.toString(words));
        }

}

