package JavaPractice;

public class ReverseWordsInString {
	public static void main(String[] args) {
		
		String word ="Leela Pravallika Nandam";
		String[] split = word.split(" ");
		
		int length =split.length;
		System.out.println(length);
		
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(split[i]+" ");
		}
	}

}
