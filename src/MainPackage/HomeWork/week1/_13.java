package MainPackage.HomeWork.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int a = b;
        List<Integer> list = new ArrayList<Integer>();
        while (b != 0) {
            list.add(b % 10);
            b /= 10;
        }
        if (list.get(0) == 1) {
            System.out.println(a + " копейка");
        } else if (list.get(0) > 1 && list.get(0) < 5){
            System.out.println(a + " копейки");
        } else if ((list.get(0) > 4 && list.get(0) < 10) || list.get(0) == 0) {
            System.out.println(a + " копеек");
        }
    }
}
