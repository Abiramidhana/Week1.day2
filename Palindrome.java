package sample;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		String rev="madam";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		System.out.println(s.charAt(i));
		}
		char ch='a';
		String add=rev+ch;
		System.out.println(add);
		if(s.equals(add))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}	
	
}
