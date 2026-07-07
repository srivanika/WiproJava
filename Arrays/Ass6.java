package Arrays;

import java.util.Arrays;

public class Ass6 {
    public static void main(String[] args) {

        int[] arr = {45, 12, 67, 34, 89, 10};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}