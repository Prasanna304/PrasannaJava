package b_List_Array;

import java.util.ArrayList;

public class E_ArrayListUserIndexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(0,"aa");	// User defined Index
		a.add(1,"ab");
		a.add("ac");
		a.add("ad");
		int i = a.size();
		System.out.println("Capacity is"+i);
		System.out.println(a.get(2));
	}
}