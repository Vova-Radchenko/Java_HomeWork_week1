package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        if (a >= 0 && a <= 1){
            System.out.println("Число в пределах от 0 до 1");
        } else{
            System.out.println("Число не в пределах от 0 до 1");
        }
    }
}
