package oops.arrays;
import java.util.Arrays;

public class MergeArrayProgram 
{
	private static int[] mergeArray(int[] arrayA, int[] arrayB)
    {
        int[] mergedArray = new int[arrayA.length + arrayB.length];
         
        int i=0, j=0, k=0; 
                 
        while (i < arrayA.length) 
        {
            mergedArray[k] = arrayA[i];
            i++;
            k++;
        } 
                 
        while (j < arrayB.length) 
        {
            mergedArray[k] = arrayB[j];
            j++;
            k++;
        } 
             
        Arrays.sort(mergedArray);
         
        return mergedArray;
    }
     
     
    public static void main(String[] args) 
    {
        int[] A = new int[] {12, -7, 18, 9, 37, -1, 21};
         
        int[] B = new int[] {27, 8, 71, -9, 18};
         
        int[] mergedArray = mergeArray(A, B);
         
        System.out.println("Array A : "+Arrays.toString(arrayA));
         
        System.out.println("Array B : "+Arrays.toString(B));
         
        System.out.println("Merged Array : "+Arrays.toString(mergedArray));
    }
}