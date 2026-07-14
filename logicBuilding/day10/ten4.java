package logicBuilding.day10;

public class ten4 {
     public int MostFrequentDigit(int input1, int input2, int input3, int input4)
    {
        // Read only region end

        int[] count = new int[10];
        int[] arr = {input1, input2, input3, input4};

        for (int n : arr)
        {
            if (n == 0)
            {
                count[0]++;
            }
            else
            {
                n = Math.abs(n);

                while (n > 0)
                {
                    count[n % 10]++;
                    n /= 10;
                }
            }
        }

        int max = -1;
        int result = 0;

        for (int i = 0; i < 10; i++)
        {
            if (count[i] > max)
            {
                max = count[i];
                result = i;
            }
            else if (count[i] == max && i > result)
            {
                result = i;
            }
        }

        return result;
    }
}
