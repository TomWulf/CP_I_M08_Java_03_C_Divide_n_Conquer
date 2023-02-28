import java.util.Scanner;

public class SafeInput
{

    /**
     * Get an integer value from the user with no constraints
     *
     *
     * @param pipe Scanner to use for input
     * @param prompt User prompt
     * @return an int value provided by the user
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retValue = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                pipe.nextLine(); // clear key buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!done);

        return retValue;
    }

    /**
     * Get a double value from the user with no constraints
     *
     *
     * @param pipe Scanner to use for input
     * @param prompt User prompt
     * @return a double value provided by the user
     */
    public static double getdouble(Scanner pipe, String prompt)
    {
        double retValue = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retValue = pipe.nextDouble();
                pipe.nextLine(); // clear key buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number not: " + trash);
            }
        }while (!done);

        return retValue;
    }



}
