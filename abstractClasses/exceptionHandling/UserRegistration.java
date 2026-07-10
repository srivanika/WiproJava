package abstractClasses.exceptionHandling;

public class UserRegistration {


    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {


        if (!userCountry.equals("India")) {

            throw new InvalidCountryException(
                    "User Outside India cannot be registered"
            );

        }
        else {

            System.out.println("User registration done successfully");

        }

    }


    public static void main(String[] args) {


        UserRegistration user = new UserRegistration();


        try {

            user.registerUser("Mickey", "US");

        }
        catch (InvalidCountryException e) {

            System.out.println(e.getMessage());

        }


        try {

            user.registerUser("Mini", "India");

        }
        catch (InvalidCountryException e) {

            System.out.println(e.getMessage());

        }

    }
}