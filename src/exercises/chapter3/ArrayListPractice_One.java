package exercises.chapter3;

import java.util.ArrayList;

public class ArrayListPractice_One {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        for (int i = 1; i <= 10; i++)
            list.add(i);

        int sum = 0;
        for (int val : list) {
            if (val % 2 == 0) {
                sum += val;
            }
        }

        System.out.println(sum);
    }
}
