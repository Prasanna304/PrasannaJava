package stringJavaPrograms;

public class C_VowelsVsConsonantsCount {

	public static void main(String[] args) 
	{
		String a = "Sample text! Lets check 1234";
		int vowel = 0;
		int cons = 0;
		int symbol = 0;
		int nos =0;
		a=a.toLowerCase();
		for (int i=0; i<a.length(); i++)
		{
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || 
					a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u')
			{
				vowel++;
			}
			else if (a.charAt(i)>= 'a' && a.charAt(i)<= 'z')
			{
				cons++;
			}
			else if (a.charAt(i)>= '0')
			{
				nos++;
			}
			else
			{
				symbol++;
			}
		}
		int total=vowel+cons+nos+symbol;
		System.out.println("Vowels count " +vowel);
		System.out.println("Consonants count " +cons);
		System.out.println("numbers count " +nos);
		System.out.println("symbol count " +symbol);
		System.out.println("symbol count " +total);
	}
}