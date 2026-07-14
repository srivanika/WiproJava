package logicBuilding.day9;

public class isPalinNumPossible {

    public static int isPalinNumPossible(int input1) {

        int[] digitCounts = new int[10];

        int temp = Math.abs(input1);

        while (temp > 0) {
            int digit = temp % 10;
            digitCounts[digit]++;
            temp /= 10;
        }

        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            if (digitCounts[i] % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalinNumPossible(313));   // 2
        System.out.println(isPalinNumPossible(123));   // 1
        System.out.println(isPalinNumPossible(1221));  // 2
    }
}