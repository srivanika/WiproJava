package logicBuilding.day9;

public class createPIN {

    public static int createPIN(int input1, int input2, int input3) {

        int u1 = input1 % 10;
        int t1 = (input1 / 10) % 10;
        int h1 = (input1 / 100) % 10;

        int u2 = input2 % 10;
        int t2 = (input2 / 10) % 10;
        int h2 = (input2 / 100) % 10;

        int u3 = input3 % 10;
        int t3 = (input3 / 10) % 10;
        int h3 = (input3 / 100) % 10;

        int unitPin = Math.min(u1, Math.min(u2, u3));
        int tensPin = Math.min(t1, Math.min(t2, t3));
        int hundredsPin = Math.min(h1, Math.min(h2, h3));

        int maxDigit = Math.max(u1,
                Math.max(t1,
                Math.max(h1,
                Math.max(u2,
                Math.max(t2,
                Math.max(h2,
                Math.max(u3,
                Math.max(t3, h3))))))));

        int pin = (maxDigit * 1000) + (hundredsPin * 100) + (tensPin * 10) + unitPin;

        return pin;
    }

    public static void main(String[] args) {

        System.out.println(createPIN(123, 456, 789));
    }
}