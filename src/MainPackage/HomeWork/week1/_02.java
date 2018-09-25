package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a > b && a > c) {
            System.out.println("Max: " + a);
        } else {
            if (b > c) {
                System.out.println("Max: " + b);
            } else {
                System.out.println("Max: " + c);
            }
        }
        if (a < b && a < c) {
            System.out.println("Min: " + a);
        } else {
            if (b < c) {
                System.out.println("Min: " + b);
            } else {
                System.out.println("Min: " + c);
            }
        }
    }
}
