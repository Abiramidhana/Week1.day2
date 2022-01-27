package sample;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss"; 
		int a,b;
		System.out.println(a=text1.length());
		System.out.println(b=text2.length());
		if(a==b)
				{
			System.out.println("Length are equal");
				}
		for(int i=0;i<text1.length();i++)
		{
		char c=text1.charAt(i);
		System.out.println(c) ;
		}
		for(int i=0;i<text2.length();i++)
		{
		char c=text2.charAt(i);
		System.out.println(c) ;
		}
		char s[] = {'s','t','o','p','s' };
		String str1=String.valueOf(s);
		System.out.println(str1);
	Arrays.sort(s);
		char s1[] = {'p','o','t','s','s' };
		String str2=String.valueOf(s1);
		System.out.println(str2);
Arrays.sort(s1);
if(s1==s)
{
	System.out.println("Both are equal");
}
else
{
	System.out.println("Both are not equal");
}
	}

}
