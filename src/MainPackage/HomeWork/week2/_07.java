package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _07 {
    public static void main(String[] args) {
        // Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
        //               	   который получается в результате суммы arr1[i] + arr2[i]

        int[] arr1 = ForWorkWithArray.createArray(10);
        int[] arr2 = ForWorkWithArray.createArray(10);
        int[] mas = new int[20];
        for (int i = 0; i < arr1.length; i++){
            mas[i] = arr1[i];
        }
        for (int i = 0, k = arr2.length; i < arr2.length; i++, k++){
            mas[k] = arr2[i];
        }
        System.out.print("Сумма масивов : ");
        ForWorkWithArray.printArray(mas);
        // -----------------------------------------
        int[] mas1 = new int[10];
        for (int i = 0; i < arr1.length; i++){
            mas1[i] = arr1[i] + arr2[i];
        }
        System.out.print("Сумма масивов (Версия 2) : ");
        ForWorkWithArray.printArray(mas1);
    }
}
