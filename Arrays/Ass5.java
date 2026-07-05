package Arrays;

import java.util.Arrays;

public class Ass5 {
     public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 5};

        Arrays.sort(arr);

        System.out.println("Smallest two numbers: " + arr[0] + " " + arr[1]);

        System.out.println("Largest two numbers: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}
