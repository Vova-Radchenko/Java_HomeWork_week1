package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _08 {
    public static void main(String[] args) {
        // Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++){
            int a = (int)(Math.random() * 10);
            if (i % 2 == 0){
                while (a % 2 != 0){
                    a = (int)(Math.random() * 10);
                }
                mas[i] = a;
            }else {
                while (a % 2 == 0){
                    a = (int)(Math.random() * 10);
                }
                mas[i] = a;
            }
        }
        System.out.print("Mas : ");
        ForWorkWithArray.printArray(mas);

    }
}
