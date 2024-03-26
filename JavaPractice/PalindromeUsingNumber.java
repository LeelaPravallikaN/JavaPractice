package JavaPractice;

public class PalindromeUsingNumber {
	public static void main(String[] args) {
		int num=111;
		int rev=num;
		int rem=1;
		int sum=0;
		
		while(num>0) {
		
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
			if(rev==sum)
			{
				System.out.println("print given number is palindrome: "+rev);
			}
			else {
				System.out.println("not a palindrome");
			}	
	}
}