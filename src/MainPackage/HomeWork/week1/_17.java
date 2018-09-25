package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int a = in.nextInt();
        int mas [] = new int[3];
        int i = 0;
        while (a != 0) {
            mas[i] = a % 10;
            a /= 10;
            if (mas[i] == 5) {
                i++;
            }
        }
        System.out.println("Число 5 встречаеться " + i + " раз");
    }
}
