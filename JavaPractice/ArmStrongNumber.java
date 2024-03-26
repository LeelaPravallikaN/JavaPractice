package JavaPractice;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		int num = 153;
		int temp= num;
		int sum = 0;
		
		while (num > 0) {
			
			int remainder = num % 10;
			sum = sum + (remainder * remainder * remainder);
			num = num / 10;
			//System.out.println(sum);
		}
		if (temp == sum) {
			System.out.println("the given number is ArmStrongNumber"+temp);
		} else {
			System.out.println("the given number is not ArmStrongNumber");
		}
	}

}
