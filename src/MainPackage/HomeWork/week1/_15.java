package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите площядь квадрата: ");
        double a = in.nextDouble();
        System.out.print("Введите площадь круга: ");
        double b = in.nextDouble();
        double r = Math.sqrt(b / 3.14);
        double c = Math.sqrt(a);
        if (r == (a * Math.sqrt(2) / 2)) {
            System.out.println("Квадрат можно вписать в круг");
        } else if (r == (c / 2)) {
            System.out.println("Круг можно вписать в квадрат");
        }
    }
}
