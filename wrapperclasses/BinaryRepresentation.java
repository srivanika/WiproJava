package wrapperclasses;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (1-255): ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);

        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println(binary);

        sc.close();
    }
}