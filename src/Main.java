import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        for (int i = 0, j = numbers.length - 1; i < numbers.length || j >= 0; ) {
            if (i < numbers.length) {
                System.out.print(numbers[i] + " ");
                i++;
            } else if (j >= 0) {
                System.out.print(numbers[j] + " ");
                j--;
            }
        }
    }
}