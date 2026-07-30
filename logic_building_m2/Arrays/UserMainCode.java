import java.util.*;
class UserMainCode
{
    public int mostFrequentlyOccurringDigit(int[] input1, int input2)
    {
        int[] freq = new int[10];
        for(int i = 0; i < input2; i++)
        {
            int num = input1[i];
            if(num == 0)
            {
                freq[0]++;
            }
            while(num > 0)
            {
                int digit = num % 10;
                freq[digit]++;
                num = num / 10;
            }
        }
        int max = freq[0];
        int ans = 0;
        for(int i = 1; i < 10; i++)
        {
            if(freq[i] >= max)
            {
                max = freq[i];
                ans = i;
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input2 = sc.nextInt();
        int[] input1 = new int[input2];
        for(int i = 0; i < input2; i++)
        {
            input1[i] = sc.nextInt();
        }
        UserMainCode obj = new UserMainCode();

        System.out.println(obj.mostFrequentlyOccurringDigit(input1, input2));
    }
}