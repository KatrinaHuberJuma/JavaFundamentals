import java.util.ArrayList;
public class Basic13 {

    // Print 1-255
    // Write a method that prints all the numbers from 1 to 255.
    public void printOneto255(){
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    // Print odd numbers between 1-255
    // Write a method that prints all 
    // the odd numbers from 1 to 255.
    public void printOdds1to255(){
        for (int i = 1; i <= 255; i+=2){
            System.out.println(i);
        }
    }

    // Print Sum
    // Write a method that prints the 
    // numbers from 0 to 255, but this 
    // time print the sum of the numbers 
    // that have been printed so far. 
    
    public void printSumto255() {
        int acc = 0;
        for (int i = 1; i <= 255; i++){
            // New number: 2 Sum: 3
            acc += i;
            System.out.println("New number: " + String.valueOf(i) + " Sum: " + String.valueOf(acc));

        }
    }

    // Iterating through an array
    // Given an array X, say [1,3,5,7,9,13], 
    // write a method that would iterate through each 
    // member of the array and print each value on the screen. 
    // Being able to loop through each member of the array is extremely important.
    public void itrArr(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    // Find Max
    // Write a method (sets of instructions) that takes any 
    // array and prints the maximum value in the array. 
    // Your method should also work with a given array that 
    // has all negative numbers (e.g. [-3, -5, -7]), or 
    // even a mix of positive numbers, negative numbers and zero.
    // public void findMax(ArrayList<Integer> arr){
    //     int maxVal;
    //     for (int i = 0; i < arr.size(); i++){
    //         if (arr.get(i) > maxVal){

    //         };
    //     }
    // }

    // Get Average
    // Write a method that takes an array, and prints the 
    // AVERAGE of the values in the array. For example for an array [2, 10, 3], 
    // your method should print an average of 5. 
    // Again, make sure you come up with a simple base case 
    // and write instructions to solve that base case first, 
    // then test your instructions for other complicated cases.

    // Array with Odd Numbers
    // Write a method that creates an array 'y' 
    // that contains all the odd numbers between 1 to 255. 
    // When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].

    // Greater Than Y
    // Write a method that takes an array and returns 
    // the number of values in that array whose value is greater 
    // than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, 
    // after your method is run it will print 2 
    // (since there are two values in the array that are greater than 3).

    // Square the values
    // Given any array x, say [1, 5, 10, -2], write a method that 
    // multiplies each value in the array by itself. When the method is done, 
    // the array x should have values that have been squared, say [1, 25, 100, 4].

    // Eliminate Negative Numbers
    // Given any array x, say [1, 5, 10, -2], write a method that 
    // replaces any negative number with the value of 0. 
    // When the method is done, x should have no negative values, say [1, 5, 10, 0].

    // Max, Min, and Average
    // Given any array x, say [1, 5, 10, -2], write a method 
    // that returns an array with the maximum number in the array, 
    // the minimum value in the array, and the average of the 
    // values in the array. The returned array should be three elements 
    // long and contain: [MAXNUM, MINNUM, AVG]

    // Shifting the Values in the Array
    // Given any array x, say [1, 5, 10, 7, -2], write a 
    // method that shifts each number by one to the front. 
    // For example, when the method is done, an x of [1, 5, 10, 7, -2] 
    // should become [5, 10, 7, -2, 0]. Notice that the last number is 0. 
    // The method does not need to wrap around the values shifted out of bounds.
}