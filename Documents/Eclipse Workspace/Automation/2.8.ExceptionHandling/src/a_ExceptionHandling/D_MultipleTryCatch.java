package a_ExceptionHandling;

public class D_MultipleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a = new int[2];
			a[0] = 10;
			a[1] = 10;
			a[2] = 10;
			a[3] = 10;
			int i = 1/0;
			System.out.println(i);
			//try can have multiple catch
		} catch (ArithmeticException e) {
			System.out.println("alert"+e.getMessage()); //change int[4] and run this to get this error
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("alert"+e.getMessage());
		}
		//but catch's only a single exception 
	}

}
