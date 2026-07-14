package logicBuilding.day8;

public class EvenDigitsSum {

    public static int EvenDigitsSum(int input1) {

        int sum = 0;

        while (input1 > 0) {
            int digit = input1 % 10;

            if (digit % 2 == 0)
                sum += digit;

            input1 /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(EvenDigitsSum(9625)); // 8
        System.out.println(EvenDigitsSum(2134)); // 6
    }
}