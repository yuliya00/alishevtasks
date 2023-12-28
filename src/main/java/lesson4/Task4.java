package lesson4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt(10000);
        }
        int max = 0;
        int maxSumIndex = 0;
        for (int index = 0; index < array.length - 2; index++) {
            int sum = 0;
            for (int j = index; j < index + 3; j++) {
                sum += array[j];
            }
            if (sum > max) {
                max = sum;
                maxSumIndex = index;
            }
        }
        System.out.println(max);
        System.out.println(maxSumIndex);
    }
}
