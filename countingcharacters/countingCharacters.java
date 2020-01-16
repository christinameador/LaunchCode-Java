package studios.countingcharacters;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.*;

public class countingCharacters {
    public static void main(String[] args) {
        // String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String quote = input.nextLine();
        char[] charactersInString = quote.toCharArray();

        // Create a HashMap using a for loop, where keys are characters and values are number of times used.
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphaChars = alphabet.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char letter : alphaChars) {
            characterCount.put(letter, 0);
        }

        // Check each value in quote (regardless of case) and increase value in HashMap by 1 for each instance.
        int currentValue = 0;
        for (char currentLetter : charactersInString) {
            char lowerCaseLetter = Character.toLowerCase(currentLetter);
            if (characterCount.containsKey(lowerCaseLetter)) {
                currentValue = characterCount.get(lowerCaseLetter);
                currentValue++;
                characterCount.replace(lowerCaseLetter, currentValue);
            };
        };

        System.out.println(characterCount);
    }
}
