/*
Second Largest

Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.
Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist.


 */


package dsa.gfg_160;

public class SecondLargestElement {

    //This is the logic
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2)
        {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

        int largest = 0;
        int secondLargest = 0;

        for(int e:arr)
        {
            if(e>largest)
            {
                secondLargest=largest;
                largest=e;
            }
            else if(e>secondLargest && e != largest)
            {
                secondLargest=e;
            }
        }

        return secondLargest;
    }



}
