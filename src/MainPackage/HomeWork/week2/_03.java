package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _03 {
    public static void main(String[] args) {
        // Поменять местами наибольший
        //               		и наименьший элементы в массиве
        int[] mas = ForWorkWithArray.createArray(10);
        int min = mas[0], max = mas[0], indexMax = 0, indexMain = 0;
        for (int i = 0; i < mas.length; i++){
            if (max < mas[i]){
                max = mas[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < mas.length; i++){
            if (min > mas[i]){
                min = mas[i];
                indexMain = i;
            }
        }
        System.out.print("Old mas: ");
        ForWorkWithArray.printArray(mas);
        mas[indexMax] = min;
        mas[indexMain] = max;
        System.out.println("New mas: ");
        ForWorkWithArray.printArray(mas);
    }
}
