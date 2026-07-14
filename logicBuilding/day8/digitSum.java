package logicBuilding.day8;

public class digitSum {

    public static int digitSum(int input1) {

        boolean negative = false;

        if (input1 < 0) {
            negative = true;
            input1 = -input1;
        }

        while (input1 >= 10) {
            int sum = 0;

            while (input1 > 0) {
                sum += input1 % 10;
                input1 /= 10;
            }

            input1 = sum;
        }

        if (negative)
            return -input1;
        else
            return input1;
    }

    public static void main(String[] args) {

        System.out.println(digitSum(976592));   // 2
        System.out.println(digitSum(123456));   // 3
        System.out.println(digitSum(-99999));   // -9
    }
}