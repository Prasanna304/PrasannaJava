package b_List_Array;

import java.util.ArrayList;

public class D_ArrayListDataRetrivalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("aa");
		a.add("ab");
		a.add("ac");
		a.add("ad");
		int i = a.size(); // Array -> Length || Collection -> Size 
		System.out.println("Capacity is"+i);
		System.out.println(a.get(2));
	}
}