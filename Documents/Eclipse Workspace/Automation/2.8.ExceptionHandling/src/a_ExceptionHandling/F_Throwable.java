package a_ExceptionHandling;

import java.util.Hashtable;

public class F_Throwable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = new int[2];
			a[0] = 10;
			a[1] = 10;
			a[2] = 10;
			a[3] = 10;
			int i = 1 / 0;
			System.out.println(i);
			// try can have multiple catch
		}
		/*
		 	catch(Throwable t) {
		  	System.out.println("Unexpected exception, running out of memory"+t.getMessage()); 
		  	}
		 */ // this shows error in other exceptions
		catch (ArithmeticException e) {
			System.out.println("alert 1st " + e.getMessage()); // change int[4] and run this to get this error
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("alert 2nd " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Something Went Wrong");
		}
		  // Throwable is also in last
		  catch(Throwable t) {
		  System.out.println("Unexpected exception, running out of memory"+t.getMessage());
		 }
		
	}

}