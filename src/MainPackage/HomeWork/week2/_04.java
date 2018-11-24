package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _04 {
    public static void main(String[] args) {
        // Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
        int[] mas1 = ForWorkWithArray.createArray(10);
        int[] mas2 = new int[10];
        for (int i = 0; i < mas1.length; i++){
            mas2[i] = mas1[i];
        }
        System.out.println("Array 1 = ");
        ForWorkWithArray.printArray(mas1);
        System.out.println("Array 2 = ");
        ForWorkWithArray.printArray(mas2);
    }
}
