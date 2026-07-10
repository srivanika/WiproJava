package abstractClasses.exceptionHandling;

import java.util.Scanner;

public class AverageMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter student 1 name:");
            String name1 = sc.nextLine();

            int[] marks1 = new int[3];

            System.out.println("Enter marks of " + name1);

            for (int i = 0; i < 3; i++) {

                marks1[i] = Integer.parseInt(sc.nextLine());

                checkMarks(marks1[i]);
            }


            System.out.println("Enter student 2 name:");
            String name2 = sc.nextLine();

            int[] marks2 = new int[3];

            System.out.println("Enter marks of " + name2);

            for (int i = 0; i < 3; i++) {

                marks2[i] = Integer.parseInt(sc.nextLine());

                checkMarks(marks2[i]);
            }


            int total1 = marks1[0] + marks1[1] + marks1[2];
            int total2 = marks2[0] + marks2[1] + marks2[2];


            System.out.println(name1 + " Average Marks = " + total1 / 3.0);

            System.out.println(name2 + " Average Marks = " + total2 / 3.0);


        }
        catch(NumberFormatException e) {

            System.out.println("java.lang.NumberFormatException");

        }
        catch(NegativeValueException e) {

            System.out.println(e.getMessage());

        }
        catch(OutOfRangeException e) {

            System.out.println(e.getMessage());

        }

        sc.close();

    }


    public static void checkMarks(int marks)
            throws NegativeValueException, OutOfRangeException {


        if(marks < 0) {

            throw new NegativeValueException(
                    "Marks cannot be negative"
            );

        }


        if(marks > 100) {

            throw new OutOfRangeException(
                    "Marks should be between 0 and 100"
            );

        }

    }
}