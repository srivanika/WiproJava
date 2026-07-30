import java.io.*;
import java.util.*;

// Read only region start
class UserMainCode1
{
    public class Result
    {
        public final int output1;
        public final int output2;
        public Result(int out1, int out2)
        {
            output1 = out1;
            output2 = out2;
        }
    }

    public Result decreasingSeq(int[] input1, int input2)
    {
        int count = 0;
        int longest = 0;
        int i = 0;

        while (i < input2)
        {
            int len = 1;

            while (i < input2 - 1 && input1[i] > input1[i + 1])
            {
                len++;
                i++;
            }

            if (len > 1)
            {
                count++;
                if (len > longest)
                {
                    longest = len;
                }
            }

            i++;
        }

        return new Result(count, longest);
    }
}