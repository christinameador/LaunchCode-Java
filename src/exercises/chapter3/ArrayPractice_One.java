package exercises.chapter3;

public class ArrayPractice_One {
    public static void main(String[] args) {
        int[] values = {1,1,2,3,5,8};
        for (int val : values) {
            if (val%2 != 0) {
                System.out.println(val);
            }
        }
    }
}
