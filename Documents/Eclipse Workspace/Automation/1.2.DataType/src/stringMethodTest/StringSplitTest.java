package stringMethodTest;

public class StringSplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",0)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",1)){  
		System.out.println(w);  
		}  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
		System.out.println(w);  
		}  
	}

}
