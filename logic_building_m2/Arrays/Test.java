public class Test {

    public static void main(String[] args) {

        UserMainCode1 obj = new UserMainCode1();

        int[] arr = {9, 7, 5, 8, 6, 4, 2};

        UserMainCode1.Result result = obj.decreasingSeq(arr, arr.length);

        System.out.println("Count = " + result.output1);
        System.out.println("Longest = " + result.output2);
    }
}