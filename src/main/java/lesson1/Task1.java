package lesson1;

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        while ( i < 10) {
            System.out.print("JAVA ");
            i++;
        }
        System.out.println();
        for (int a = 0; a < 10; a++) {
            System.out.print("JAVA ");
        }
        System.out.println();
        for (int a = 0; a < 10; a++) {
            System.out.println("JAVA");
        }
        System.out.println();
        int year = 1980;
        while (year <= 2020) {
            System.out.printf("Олимпиада %d года \n", year);
            year += 4;
        }
        System.out.println();
        for (int b = 1980; b <= 2020; b += 4) {
            System.out.printf("Олимпиада %d года \n", b);
        }
        int k = 8;
        for (int c = 1; c < 11; c++) {
            int a = c * k;
            System.out.printf("%d x %d = %d \n", c, k, a);
        }
    }
}
