/*
 
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
6 12 18 24 30 36
7 14 21 28 35 42 49
8 16 24 32 40 48 56 64
9 18 27 36 45 54 63 72 81
10 20 30 40 50 60 70 80 90 100
 
*/

package pattern;

public class Pattern3 {
	public static void main(String[] args){  
		int lines=10;  
		int i=1;  
		int j;  
		for(i=1;i<=lines;i++){// this loop is used to print the lines  
		for(j=1;j<=i;j++){// this loop is used to print lines  
		System.out.print(i*j+" ");  
		}  
		System.out.println("");  
		}  
		}  
}
