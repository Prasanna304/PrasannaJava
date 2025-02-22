/*
 * Jagged Explanation
 * If we are creating odd number of columns in a 2D array, it is known as a jagged array. 
 * In other words, it is an array of arrays with different number of columns.
 */

package b_MultiDimentionArray;

public class A_Jagged {

	public static void main(String[] args) {
		//declaring a 2D array with odd columns  
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for (int i=0; i<arr.length; i++)  
            for(int j=0; j<arr[i].length; j++)  
                arr[i][j] = count++;  
   
        //printing the data of a jagged array   
        for (int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
	}

}
