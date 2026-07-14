package logicBuilding.day10;

public class ten3 {
    public int weightOfString(String input1, int input2)
{
    int sum = 0;

    input1 = input1.toLowerCase();

    for(int i = 0; i < input1.length(); i++)
    {
        char ch = input1.charAt(i);

        if(ch >= 'a' && ch <= 'z')
        {
            if(input2 == 0 && "aeiou".indexOf(ch) != -1)
                continue;

            sum += (ch - 'a' + 1);
        }
    }

    return sum;
}
}
