package lesson2;

import java.util.Scanner;
import java.lang.Math;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;
        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / x + 7;
            System.out.printf("x = %.2f , y = %.2f", x, y);
        } else if (x < 5 && x > -3) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.printf("x = %.2f , y = %.2f", x, y);
        } else {
            y = 420;
            System.out.printf("x = %.2f , y = %.2f", x, y);
        }
    }
}
