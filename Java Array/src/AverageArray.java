/**
 * The Avearage array program
 * Calculates the sum than return's an average
 * Of a given array.
 * @author Sibulelo Zondi
 */

public class AverageArray {
    /**
     * Function calculates average of an Array of Integers
     * @param arr takes array of integers
     * @return returns an average of Double
     */

    public static double calcAverage(int[] arr){
        int sum = 0;
        for (int i : arr){
            //sum = sum + i (i = index)
            sum += i;
        }
        System.out.println("The sum of the array is " + sum +" and the length (size) is " + arr.length + ".");
        return (double) sum/arr.length;
    }
    public static void main(String[] args){

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The average is: " + calcAverage(arr));
    }
}
