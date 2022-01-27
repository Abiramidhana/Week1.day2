package sample;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char search='e';
		char[]ch= str.toCharArray();
		for (char c : ch) {
            System.out.println(c);
		}
		
		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==search)
			 count++;
	      }
		 System.out.print(count);
	}

}
