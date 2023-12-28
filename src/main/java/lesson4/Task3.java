package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                array[row][cell] = random.nextInt(50);
            }
            System.out.println(Arrays.toString(array[row]));
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}
