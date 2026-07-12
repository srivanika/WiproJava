package logicBuilding.day4;



class UserMainCode {
    public int lastDigitOf(int input1) {

        input1 = Math.abs(input1);

        return input1 % 10;
    }
}