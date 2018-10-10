package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // test
        int a = in.nextInt();
        if (a >= 9 && a <= 18) {
            System.out.println("Я на работе");
        } else {
            if (a >= 0 && a < 9 || a > 18 && a <=24) {
                System.out.println("Я отдыхаю");
            } else {
                System.out.println("Error!!!");
            }
        }
    }
}
