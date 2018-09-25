package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 7 == 0) {
            System.out.println(a * 2);
        }
    }
}
