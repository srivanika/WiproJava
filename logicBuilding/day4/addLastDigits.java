package logicBuilding.day4;



class UserMainCode {
    public int addLastDigits(int input1, int input2) {

        input1 = Math.abs(input1);
        input2 = Math.abs(input2);

        return (input1 % 10) + (input2 % 10);
    }
}