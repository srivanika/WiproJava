package abstractClasses.exceptionHandling;
import java.util.Scanner;
public class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array");
            int size = Integer.parseInt(sc.nextLine());
            int[] array = new int[size];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                array[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Enter the index of the array element you want to access");
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
        sc.close();
    }
}