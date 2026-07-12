package logicBuilding.day6;



// Read only region start
class UserMainCode
{
    public int NthPrime(int input1)
    {
        int count = 0;
        int num = 1;

        while (count < input1)
        {
            num++;
            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(num); i++)
            {
                if (num % i == 0)
                {
                    prime = false;
                    break;
                }
            }

            if (prime)
                count++;
        }

        return num;
    }
}

