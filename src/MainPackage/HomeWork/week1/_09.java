package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ценну покупки:");
        int a = in.nextInt();
        if (a > 1000) {
            double b = a * 0.9;
            System.out.println("С вас к оплате " + b);
        } else {
            System.out.println("С вас к оплате " + a);
        }
    }

}
