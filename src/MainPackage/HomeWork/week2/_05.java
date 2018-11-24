package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class _05 {
    public static void main(String[] args) {
        // Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве
        int[] mas = ForWorkWithArray.createRandomArray(20);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] == a){
                count++;
            }
        }
        System.out.print("Your Array : ");
        ForWorkWithArray.printArray(mas);
        System.out.println("Ваше число встречаеться в массиве " + count + " раз");
    }
}
