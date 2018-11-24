package MainPackage.HomeWork.week2;

import MainPackage.HomeWork.Function.ForWorkWithArray;

public class _10 {
    public static void main(String[] args) {
        // public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end
        //               	}
        int[] mas = ForWorkWithArray.createRandomArray(10);
        int[] mas1 = ForWorkWithArray.splitArray(mas, 2, 5);
        ForWorkWithArray.printArray(mas);
        ForWorkWithArray.printArray(mas1);
    }
}
