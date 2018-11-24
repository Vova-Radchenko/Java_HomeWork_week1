package MainPackage.HomeWork.Function;

public class ForWorkWithArray {
    public static int[] createArray (int size){
        int mas[] = new int[size];
        for (int i = 0; i < mas.length; i++){
            mas[i] = i;
        }
        return mas;
    }
    // -----------------------------------------------
    public static void printArray (int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    // -----------------------------------------------
    public static int[] createRandomArray (int size){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int) (Math.random() * 10);
        }
        return mas;
    }
    // -----------------------------------------------
    public static int[] splitArray(int[] arr, int start, int end){
        int[] mas = new int[end - start + 1];
        for (int i = start, k = 0; k < mas.length; i++, k++){
            mas[k] = arr[i];
        }
        return mas;
    }
    // -----------------------------------------------

}
