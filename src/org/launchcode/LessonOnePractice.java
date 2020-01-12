package org.launchcode;
import java.util.Scanner;

public class LessonOnePractice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Name:");
        String userName = keyboard.nextLine();
        System.out.println("Name " + userName);

        System.out.println("Age:");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        // keyboard.skip('\n');
        System.out.println("Age: " + age);

        System.out.println("Quest:");
        String quest = keyboard.nextLine();
        System.out.println("Quest: " + quest);
    }
}
