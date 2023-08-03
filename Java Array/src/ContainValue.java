import java.util.Scanner;

/**
 * To contain value program
 * Test if an array contains a specific value
 * @author Sibulelo Zondi
 */
public class ContainValue {

    /**
     * Contains value function
     * @param arr array parameter
     * @param value value to look for parameter
     * @return returns a String message
     */
    public static String containsValue(int[] arr, int value){

        if (value < 0){
            System.out.println("Value: " + value + " can not be a negative number");
        }
        for (int i : arr){
            if (i == value){
                return value +" is found in the array.";
            }
        }
        return value +" is not found in the array.";
    }
    
    public static void main(String[] args){
        //new array
        int arr[] = {1,2,3,4,5,6,7,8,9,0};

        System.out.print("Enter the value to look for: ");

        Scanner inputValue = new Scanner(System.in);
        int value = inputValue.nextInt();

        System.out.println(containsValue(arr,value));

    }
}
