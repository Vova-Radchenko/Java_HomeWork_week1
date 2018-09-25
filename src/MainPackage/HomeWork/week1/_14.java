package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        int a = in.nextInt();
        int mas [] = new int[6];
        int i = 0;
        while (a != 0) {
            mas[i] = a % 10;
            a /= 10;
            i++;
        }
        int b = mas[0] + mas[1] + mas[2];
        int c = mas[3] + mas[4] + mas[5];
        if (b == c) {
            System.out.println("Ваше число счастливое");
        }
    }
}
