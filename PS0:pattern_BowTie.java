// -------------------------------------------------
// PS0:Pattern_Bowtie
// -------------------------------------------------

// --------------------------------------
// P R O B L E M   S T A T E M E N T 

// Write a method Met that takes as parameter an integer N and prints an NxN formation like the examples below. 
// The Met method has to be inside a Solution class. Please check the code editor for the ideal method definition.

// Hint: Is there a relation between row number and the number of *? What about row number and number of .?

// Example Input: 1
// Example Output:

// *.*
// ***
// *.*

// Example Input: 5
// Example Output:

// *.........*
// **.......**
// ***.....***
// ****...****
// *****.*****
// ***********
// *****.*****
// ****...****
// ***.....***
// **.......**
// *.........*



// --------------------------------------
// S O L U T I O N   I N   J A V A 

class Solution {
    public static void Met(int N) { 
        //int n = Integer.parseInt(args[0]);

        for (int i = -N; i <= N; i++) {
            for (int j = -N; j <= N; j++) {
                if (i*i <= j*j) System.out.print("*");
                else            System.out.print(".");
            }
            System.out.println();
        }
    }
}

// --------------------------------------
