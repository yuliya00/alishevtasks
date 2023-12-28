package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[length];
        int moreThanEight = 0;
        int equalToOne = 0;
        int evenNumbers = 0;
        int oddNumber = 0;
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt(10);
            if (array[index] > 8) {
                moreThanEight++;
            }
            if (array[index] == 1) {
                equalToOne++;
            }
            if (array[index] % 2 == 0) {
                evenNumbers++;
            }
            if (array[index] % 2 != 0) {
                oddNumber++;
            }
        }
        System.out.println("Введено число " + length + ". Сгенерирован следующий массив: \n" + Arrays.toString(array) +
                "\nИнформация о массиве:" +
                "\nДлина массива: " + array.length +
                "\nКоличество чисел больше 8: " + moreThanEight +
                "\nКоличество чисел равных 1: " + equalToOne +
                "\nКоличество четных чисел: " + evenNumbers +
                "\nКоличество нечетных чисел: " + oddNumber +
                "\nСумма всех элементов массива: " + Arrays.stream(array).sum()
        );
    }
}
