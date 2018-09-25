package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой вес: ");
        int a = in.nextInt();
        if (a < 40) {
            System.out.println("Вам нужно набрать вес");
        } else if (a > 60) {
            System.out.println("Вам нужно сбросить вес");
        } else {
            System.out.println("У вас нормальный вес");
        }
    }
}
