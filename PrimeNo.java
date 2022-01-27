package sample;

public class PrimeNo {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;      
		  
		   for( int i=2;i<=input/2;i++){      
		    if(input%i==0){      
//		     System.out.println("It  is not prime number");      
		     flag=true;      
		       
		    }  
		    
		   }
		   if(flag==true)
		   {
			   System.out.println("It is a not a prime no");
		   }
		   if(flag==false)  { System.out.println("It  is prime number"); }  
		  }
		}    
