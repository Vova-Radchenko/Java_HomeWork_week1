package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.println();
        System.out.print("Enter b: ");
        int b = in.nextInt();
        System.out.println();
        System.out.print("Enter c: ");
        int c = in.nextInt();
        System.out.println();

        if (a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a) {
            System.out.println("Треугольник прямоугольный");
        } else {
            System.out.println("Треугольник не прямоугольный");
        }
    }
}
