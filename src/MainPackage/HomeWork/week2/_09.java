package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _09 {
    public static void main(String[] args) {
        // Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        int count1 = 0, count2 = 0;
        for (int i = 0; i < mas1.length; i++){
            int a = 25 + (int)(Math.random() * 50), b = 25 + (int)(Math.random() * 50);
            mas1[i] = a;
            mas2[i] = b;
            if (mas1[i] % 2 == 0){
                count1++;
            }
            if (mas2[i] % 2 == 0){
                count2++;
            }
        }
        System.out.print("Mas1 : ");
        ForWorkWithArray.printArray(mas1);
        System.out.print("Mas2 : ");
        ForWorkWithArray.printArray(mas2);
        if (count1 > count2){
            System.out.println("У первого массива больше парных чисел");
        }else System.out.println("У второго массива больше парных чисел");
    }
}
