package abstractClasses.exceptionHandling;

public class PersonAgeValidation {


    public static void main(String[] args) {


        try {

            if(args.length != 2) {

                System.out.println("Please enter name and age");
                return;

            }


            String name = args[0];

            int age = Integer.parseInt(args[1]);


            if(age < 18 || age >= 60) {

                throw new InvalidAgeException(
                        "Age should be between 18 and 59"
                );

            }


            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Valid age");


        }
        catch(NumberFormatException e) {

            System.out.println(
                    "Age should be a number"
            );

        }
        catch(InvalidAgeException e) {

            System.out.println(
                    e.getMessage()
            );

        }

    }
}