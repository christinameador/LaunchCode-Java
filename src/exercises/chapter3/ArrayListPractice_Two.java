package exercises.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice_Two {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(6);
        names.add("Lucas");
        names.add("Agnes");
        names.add("Maverick");
        names.add("Christina");
        names.add("Reya");
        names.add("Jack");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name Length:");
        int userValue = input.nextInt();

        for (String val : names) {
            if (val.length() == userValue) {
                System.out.println(val);
            }
        }
    }
}
