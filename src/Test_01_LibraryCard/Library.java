package Test_01_LibraryCard;

public class Library {
    final String[] allowedCities = {"Marion", "Columbus"};

    public void getLibraryCardApproved(String city) {

        for (String each : allowedCities) {
            try {
                if (each.equalsIgnoreCase(city)) {
                    System.out.println("Approved !");
                    break;
                } else {
                    throw new NonResidentException("Non resident");
                }
            } catch (NonResidentException e) {
                System.out.println(e);
                System.exit(1);
            }
        }
    }

    public void allowBorrow(boolean checkedOut) {
        try {
            if (checkedOut) {
                System.out.println("Enjoy Reading !");
            } else {
                throw new FailToCheckOutException("FailToCheckOutException");
            }
        } catch (FailToCheckOutException e) {
            System.out.println("Failed to Check Out !");
        }
    }


    public boolean yesNo(String userInput) {
        if (userInput.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return false;
        }
    }
}