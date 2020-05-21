
package Reversed;

/**
 * *************************************************************
 * Purpose/Description: <This program will get the array and will see
 * if the array can be reversed>
 * Author’s Panther ID: 
 * Certification: I hereby certify that this work is my own and none of it is
 * the work of any other person.
*************************************************************
 */
public class ReversedArray {
/**
 * This method will check if the array is the same when it is reversed
 * @param arr the array
 * @param i the first int
 * @param j last int
 * @return either true or false
 */
    static boolean backwardsArray(int arr[], int i, int j) {

        if (i >= j) { // checks if the i is less or greater to j

            return true;

        }

        if (arr[i] == arr[j]) { // checks if the arrays are the same

            return backwardsArray(arr, i + 1, j - 1); /* returns method with 
                    array, i, and j */

        } else {
            return false; // returns false
        }

    }
/*
    This is the main in which will make the program run and run some test to 
    see if the array is either false or true.
    */
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 2, 1}; // array
        System.out.println("Input: a[] = {1, 2, 3, 2, 1}");// prints
        if (backwardsArray(a, 0, a.length - 1)) { // if statement
            System.out.println("Output: True \n"); // prints
        } else {
            System.out.println("Output: False\n"); // prints
        }

        int b[] = {1, 2, 3, 4, 5};// array
        System.out.println("Input: b[] = {1, 2, 3, 4, 5}");// prints
        if (backwardsArray(b, 0, b.length - 1)) { // if statement
            System.out.println("Output: True\n"); // prints
        } else {
            System.out.println("Output: False\n"); // prints
        }

        int c[] = {12, 32, 67, 32, 12};// array
        System.out.println("Input: c[] = {12, 32, 67, 32, 12}"); // prints
        if (backwardsArray(c, 0, c.length - 1)) { // if statement
            System.out.println("Output: True\n"); // prints
        } else {
            System.out.println("Output: False\n"); // prints
        }

    }

}
