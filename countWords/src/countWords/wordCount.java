package countWords;

import java.util.Scanner;

public class wordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String to count the number of words!!");
		String str=input.nextLine();
	
		String[] strArr=str.split(" ");
		
		
		System.out.println("The number of words in a given String is "+strArr.length);
	}

}
