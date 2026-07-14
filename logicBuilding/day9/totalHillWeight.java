package logicBuilding.day9;

public class totalHillWeight {

    public static int totalHillWeight(int input1, int input2, int input3) {

        int totalWeight = 0;
        int currentWeight = input2;

        for (int i = 1; i <= input1; i++) {
            totalWeight += i * currentWeight;
            currentWeight += input3;
        }

        return totalWeight;
    }

    public static void main(String[] args) {

        System.out.println(totalHillWeight(5, 10, 2));
    }
}