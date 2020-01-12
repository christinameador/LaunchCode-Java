package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice_Two {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordArray));

        String[] sentenceArray = sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));
    }
}
