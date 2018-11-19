package MainPackage.HomeWork.Function;

public class ForWorkWithArray {
    public static int[] createArray (int size){
        int mas[] = new int[size];
        for (int i = 0; i < mas.length; i++){
            mas[i] = i;
        }
        return mas;
    }

    public static void printArray (int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i]);
        }
        System.out.println();
    }
}
