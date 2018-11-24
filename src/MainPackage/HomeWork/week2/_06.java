package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _06 {
    public static void main(String[] args) {
        // Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
        int [] mas = ForWorkWithArray.createRandomArray(20);
        int[] mas1 = new int[mas.length/2], mas2 = new int[mas.length/2];
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < mas.length/2; i++){
            mas1[i] = mas[i];
            sum1 += mas1[i];
        }
        sum1 /= mas1.length;
        for (int i = (mas.length/2),  j = 0; i < mas.length; i++, j++){
            mas2[j] = mas[i];
            sum2 += mas2[j];
        }
        sum2 /= mas2.length;
        System.out.print("Начальный массив : ");
        ForWorkWithArray.printArray(mas);
        if (sum1 > sum2){
            System.out.println("Половина массива с большим средни арифметическим");
            ForWorkWithArray.printArray(mas1);
        }else if (sum2 > sum1){
            System.out.println("Половина массива с большим средни арифметическим");
            ForWorkWithArray.printArray(mas2);
        }else if (sum1 == sum2){
            System.out.println("Средние арифметические обеех половин равны");
//            ForWorkWithArray.printArray(mas2);
        }
    }
}
