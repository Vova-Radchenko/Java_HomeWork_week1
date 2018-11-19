package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _02 {
    public static void main(String[] args) {
        // Найти среднее арифметическое массива
        int[] mas = ForWorkWithArray.createArray(50);
        int sum = 0;
        for (int i = 0; i < mas.length; i++){
            sum += mas[i];
        }
        System.out.println("Среднее арифметическое массива = " + sum/mas.length);
    }
}
