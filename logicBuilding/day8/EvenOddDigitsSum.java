package logicBuilding.day8;

public class EvenOddDigitsSum {

    public static int EvenOddDigitsSum(int input1, String input2) {

        int sum = 0;
        input2 = input2.toLowerCase();

        while (input1 > 0) {
            int digit = input1 % 10;

            if (input2.equals("even")) {
                if (digit % 2 == 0)
                    sum += digit;
            } else if (input2.equals("odd")) {
                if (digit % 2 != 0)
                    sum += digit;
            }

            input1 /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(EvenOddDigitsSum(9625, "odd"));   // 14
        System.out.println(EvenOddDigitsSum(2134, "even"));  // 6
    }
}