package Test_01_LibraryCard;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String enterCity, yesNo;

        Scanner scan = new Scanner(System.in);
        Library memberA = new Library();

        System.out.println("Please Enter city name:");
        enterCity = scan.nextLine();

        memberA.getLibraryCardApproved(enterCity);


       System.out.println("Do you wish to checkout?\nPress:\nY for YES \nN for NO");
       yesNo = scan.nextLine();
       memberA.allowBorrow(memberA.yesNo(yesNo));
    }
}
