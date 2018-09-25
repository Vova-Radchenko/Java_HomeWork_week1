package MainPackage.HomeWork.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        System.out.print("Введите первое число: ");
        int b = in.nextInt();
        int a = b;
        System.out.print("Введите второе число: ");
        int c = in.nextInt();
        int d = c;
        while (b != 0) {
            list.add(b % 10);
            b /= 10;
        }
        while (c != 0) {
            list1.add(c % 10);
            c /= 10;
        }
        if (list.get(0) == list1.get(0)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
