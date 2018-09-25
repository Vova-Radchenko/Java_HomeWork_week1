package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Тарификация разговора 1 грн за 1 минуту");
        System.out.println("Введите длидельность разговора: ");
        int a = in.nextInt();
        System.out.println("Введите день едели: ");
        int b = in.nextInt();
        if (b == 6 || b == 7) {
            double c = a * 0.8;
            System.out.println("С вас: " + c + "грн.");
        } else {
            System.out.println("С вас: " + a + "грн.");
        }
    }
}
