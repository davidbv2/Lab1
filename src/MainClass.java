

/**
 * Created by Grand Circus Student on 7/10/2017.
 */
import java.util.Scanner;

public class MainClass
{
    public static void main(String [] args)
    {
        double roomLength = 0;
        double roomWidth = 0;
        double roomHeight = 0;
        String userAnswer = "";
        Scanner scnr = new Scanner(System.in); // allow program to accept user input


        do {

            // introduce program to user
            System.out.println("Welcome to Grand Circus' Room Detail Generator");
            System.out.print("Enter name of room:");

            // allow user to input room name
            String grandCircusRoom = scnr.nextLine();

            //prompt user to enter length of room
            System.out.println("Enter the length of the room in inches: ");

            //allow user to input length
            roomLength = scnr.nextDouble();

//            while (userNum <= 0 || userNum >= 101) {
//                System.out.println("Please enter a number between 1-100.");
//                userNum = scan.nextInt();
//            }
//            scan.nextLine();
////
//        while (roomLength <= 0.0) {
//            System.out.println("Please enter only numbers.");
//            roomLength = scnr.nextDouble();//clears out non-double
//        }
//        scnr.nextLine();

            //prompt user to enter width of room
            System.out.println("Enter the width of the room in inches: ");

            //allow user to input width of room
            roomWidth = scnr.nextDouble();
            scnr.nextLine();

            //prompt user to input height of room
            System.out.println("Enter the height of the room in inches: ");

            //allow user to input height of room
            roomHeight = scnr.nextDouble();
            scnr.nextLine();

        /* Process - create functions that calculate the area and perimeter of a room. Then assign each value to a new
        variable. */

            double roomArea = (roomLength * roomWidth);
            double roomPerimeter = (2 * (roomLength + roomWidth));
            double roomVolume = (roomLength * roomWidth * roomHeight);

            //Output - print statements that display area and perimeter of room

            System.out.println(grandCircusRoom + "'s area is " + roomArea + " inches, perimeter is " + roomPerimeter +
                    " inches and volume is " + roomVolume + " cubic inches.");

            System.out.print("Would you like the calculations for another room? Enter 'Yes' or 'No': ");
            userAnswer = scnr.next();
            System.out.println();

        } while (userAnswer.equals("Yes"));

        System.out.println("Goodbye!");









    }
}
