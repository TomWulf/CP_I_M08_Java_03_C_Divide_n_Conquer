import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // We can use methods to divide up the code we have to write into doable 'chunks'
        // This is called divide and conquer

        // Let's outline a simple program in pseudocode and then cod eit in Java using methods.
        // We will also use our SafeInput method library  Note that since you are supposed to develop your own copy of the library
        // I'm just using a smaller version with just the methods that we need

        // Program description.  Create a table that shows the growth of an investment for
        // - a user specified initial amount
        // - an user specified rate of interest growth
        // - for a user specified number of months.

        // Here is the outline for the program

        // Step #1 collect the data from the user using SafeInput routines

        // Step #2 display the table showing the interest growth for the specified period


        // Declarations
        Scanner in = new Scanner(System.in);

        double interestRate;   // The rate of interest for the monthly growth  this is usually a fractional value like .05
        double initialAmount;  // The starting balance for the investment must be greater than 0;
        int months;            // How many months must be greater than 0

        interestRate = SafeInput.getdouble(in, "Enter the interest rate for your investment");
        initialAmount = SafeInput.getdouble(in, "Enter the initial amount for your investment");
        months = SafeInput.getInt(in, "Enter the number of months that you want to invet");

        // Display the results table
        displayResults(initialAmount, interestRate, months);


    }

    /**
     *   Generate the table showing the investment results
     *
     *
     * @param initialAmt  initial amt invested
     * @param interestRate month rate of interest
     * @param numMonths number of months of interest
     */
    private static void displayResults(double initialAmt, double interestRate, int numMonths)
    {
        double balance = initialAmt;

        System.out.println("\n\nInvestment Calculator");
        System.out.printf("\nInitial Amount: %12.2f", initialAmt);
        System.out.printf("\nInterest Rate:  %12.2f", interestRate);
        System.out.printf("\nMonths:         %12d\n", numMonths);

        // Generate the table header

        System.out.println("Month            Amount");
        System.out.println("_______________________");

        for(int m = 1; m <= numMonths; m++)
        {
            balance += interestRate * balance;  // add the interest to the balance
            System.out.printf("%3d\t%20.2f\n", m, balance);
        }
        System.out.println("_______________________");
    }
}