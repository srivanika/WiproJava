package logicBuilding.day8;

public class OddDigitsSum {

    public static int OddDigitsSum(int input1) {

        int sum = 0;

        while (input1 > 0) {
            int digit = input1 % 10;

            if (digit % 2 != 0)
                sum += digit;

            input1 /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(OddDigitsSum(9625)); // 14
        System.out.println(OddDigitsSum(2134)); // 4
    }
}