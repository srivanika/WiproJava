package logicBuilding.day5;

class UserMainCode
{
    public int isMultiple(int input1, int input2)
    {
        if(input1 == 0 || input2 == 0)
            return 3;

        if(input1 % input2 == 0)
            return 2;
        else
            return 1;
    }
}