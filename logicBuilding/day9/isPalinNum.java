package logicBuilding.day9;

public class isPalinNum {

    public static int isPalinNum(int input1) {

        int originalNum = input1;
        int reversedNum = 0;

        while (input1 > 0) {
            int remainder = input1 % 10;
            reversedNum = (reversedNum * 10) + remainder;
            input1 = input1 / 10;
        }

        if (originalNum == reversedNum) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalinNum(121));   // 2
        System.out.println(isPalinNum(123));   // 1
    }
}