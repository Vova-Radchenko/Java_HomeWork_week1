package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mounth = in.nextInt();

        if (mounth == 12 || mounth == 1 || mounth == 2) {
            System.out.println("Now is winter");
        } else if (mounth == 3 || mounth == 4 || mounth == 5) {
            System.out.println("Now is spring");
        } else if (mounth == 6 || mounth == 7 || mounth == 8){
            System.out.println("Now is summer");
        } else if (mounth == 9 || mounth == 10 || mounth == 11){
            System.out.println("Now is autumn");
        } else {
            System.out.println("Вы введи неверное число");
        }
    }
}
