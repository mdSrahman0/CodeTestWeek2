import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] myArray = {2,8,9,3,4,3,2,6,6,2,4,9,8};

        // Call the Array.sort method to sort array
        Arrays.sort(myArray);

        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
    }
}
