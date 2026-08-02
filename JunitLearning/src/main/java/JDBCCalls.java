public class JDBCCalls {

    public static void main(String[] args) {

        DAOClass dao = new DAOClass();

        if (args.length == 0) {
            System.out.println("Please provide an option.");
            return;
        }

        int option = Integer.parseInt(args[0]);

        switch (option) {

            // Insert
            case 1:
                if (args.length != 6) {
                    System.out.println("Usage:");
                    System.out.println("java JDBCCalls 1 RollNo StudentName Standard DateOfBirth Fees");
                    return;
                }

                dao.insert(
                        Integer.parseInt(args[1]),
                        args[2],
                        args[3],
                        args[4],
                        Double.parseDouble(args[5])
                );
                break;

            // Delete
            case 2:
                if (args.length != 2) {
                    System.out.println("Usage:");
                    System.out.println("java JDBCCalls 2 RollNo");
                    return;
                }

                dao.delete(Integer.parseInt(args[1]));
                break;

            // Modify
            case 3:
                if (args.length != 3) {
                    System.out.println("Usage:");
                    System.out.println("java JDBCCalls 3 RollNo NewFee");
                    return;
                }

                dao.modify(
                        Integer.parseInt(args[1]),
                        Double.parseDouble(args[2])
                );
                break;

            // Display
            case 4:

                if (args.length == 2) {

                    dao.display(Integer.parseInt(args[1]));

                } else {

                    dao.display(null);

                }

                break;

            default:
                System.out.println("Invalid Option");
        }

    }
}