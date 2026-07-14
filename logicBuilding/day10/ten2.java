package logicBuilding.day10;

public class ten2 {
    public int isPalindrome(String input1)
{
    input1 = input1.toLowerCase();

    int i = 0;
    int j = input1.length() - 1;

    while(i < j)
    {
        if(input1.charAt(i) != input1.charAt(j))
            return 1;

        i++;
        j--;
    }

    return 2;
}
}
