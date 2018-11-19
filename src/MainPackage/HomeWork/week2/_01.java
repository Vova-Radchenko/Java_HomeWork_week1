package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _01 {
    public static void main(String[] args) {
        // Найти минимальное и максимальное значения в массиве и вывести их на консоль
        int[] mas = ForWorkWithArray.createArray(20);
        int min = mas[0], max = mas[0];
        for (int i = 0; i < mas.length; i++){
            if (max < mas[i]){
                max = mas[i];
            }
        }
        for (int i = 0; i < mas.length; i++){
            if (min > mas[i]){
                min = mas[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
