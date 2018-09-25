package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше число: ");
        int a = in.nextInt();
        int mas [] = new int[5];
        int i = 0;
        while (a != 0) {
            mas[i] = a % 10;
            a /= 10;
            i++;
        }
        if (mas[0] == mas[1] && mas[0] == mas[2]) {
            System.out.println("Все цифры равны");
        } else if (mas[0] == mas[1]) {
            System.out.println("Среди цифр две одинаковые");
        } else if (mas[1] == mas[2]) {
            System.out.println("Среди цифр две одинаковые");
        } else {
            System.out.println("Среди цифр нет одинаковых");
        }
    }
}
