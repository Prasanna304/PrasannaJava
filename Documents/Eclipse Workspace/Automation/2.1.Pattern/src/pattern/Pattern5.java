/*

12344321
123**321
12****21
1******1
 
*/

package pattern;

public class Pattern5 {

	public static void main(String[] args) {
		 int lines=4;  
		    int i,j;  
		    int space=0;  
		    for(i=0;i<lines;i++){// this loop is used to print lines  
		        for(j=1;j<=space;j++){// this loop is used to print space in a line  
		            System.out.print(" ");  
		        }  
		        for(j=1;j<=lines;j++){// this loop is used to print numbers in a line  
		            if(j<=(lines-i))  
		            System.out.print(j);  
		            else  
		            System.out.print("*");  
		        }  
		        j--;  
		        while(j>0){// this loop is used to print numbers in a line  
		            if(j>lines-i)  
		            System.out.print("*");  
		            else  
		            System.out.print(j);  
		            j--;  
		        }  
		        if((lines-i)>9)// this loop is used to increment space  
		        space=space+1;  
		    System.out.println("");
		    }
	}

}
