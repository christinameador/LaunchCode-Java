package studios.areaofacircle;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        float radius = input.nextFloat();

        while (radius < 0 || radius%1 != 0) {
            System.out.println("Invalid. Enter an integer greater than 0.");
            System.out.println("Enter a radius:");
            radius = input.nextFloat();
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}

