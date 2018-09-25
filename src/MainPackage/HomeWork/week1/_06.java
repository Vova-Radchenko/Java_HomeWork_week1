package MainPackage.HomeWork.week1;

import java.util.Scanner;

public class _06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter speed in km/h: ");
        int KilometersPerHour = in.nextInt();
        System.out.print("Enter speed m/s: ");
        int MetersPerSecond = in.nextInt();

        double MetersPerSecond_2 = (KilometersPerHour * (1000.0 / 3600.0));

        if (MetersPerSecond_2 > MetersPerSecond){
            System.out.println("Скорость в км/с больше");
        } else {
            System.out.println("Скорость в м/с больше");
        }
    }
}
