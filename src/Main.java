// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr_second = new int[]{1, 2, 3};
        for (int ii = 0; ii < arr_second.length; ii++) {
            System.out.println(arr_second[ii]);
        }
        int n = 0;


        Scanner num = new Scanner(System.in);
        System.out.println("input the number:");
        int i;
        i = num.nextInt();
        arr[n] = i;
        n += 1;


        Scanner h = new Scanner(System.in);
        System.out.println("input the number:");
        int k;
        k = h.nextInt();
        arr[n] = k;
        System.out.println("result - " + arr[n]);
        if (i > 3 && k > 3) {
            System.out.println("bothe numbers more then 3");
            int sum_res = sum(i,k);
            System.out.println("sum is - " + sum_res);
        }
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int hj = 233;
        char gh = 'A';
        System.out.println("Hello and welcome!" + gh);
        String dff;
        Scanner num_1 = new Scanner(System.in);
        System.out.println("Input the string:");
        dff = num_1.nextLine();
        System.out.println("the string - " + dff);

        Person mike = new Person();
        mike.height = 189;
        mike.weight = 73.89f;


    }
    public static int sum(int i, int j){
        int res;
        res = i + j;
        return res;
    }
}