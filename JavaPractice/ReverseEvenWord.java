package JavaPractice;

public class ReverseEvenWord {
	public static void main(String[] args) {
		//initialize the String
		String text = "Iam a Software Tester";
		
		//use the split method to split the words 
		String[] StringArray = text.split("");
		
		//Apply the for loop 
		for(int i=0;i<StringArray.length;i++) {
			
			//Apply the if codition 
			if(i%2==1) {
				//Apply toCharArray Method
				char[] charArray = StringArray[i].toCharArray();
				//iterate the loop
				for(int j=charArray.length-1;j>=0;j--) {
					
					System.out.println(charArray[j]);
				}
				System.out.println("");
			}
			else
			{
			System.out.println(StringArray[i]+" ");	
			}
		}
	}
}
