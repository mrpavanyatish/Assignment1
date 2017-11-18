package checkDuplicate;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateWordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String to count the number of words!!");
		String str=input.nextLine();
		
		String[] strArr=str.split(" ");
		Arrays.sort(strArr);
		
		Boolean yesOrNo=false;
		for(int i=0;i<strArr.length;i++)
		{
			String check = strArr[i];
			int count =0;
			for(int j=i;j<strArr.length;j++)
			{
				if(check.equals(strArr[j]))
				{
					count = count +1;
				}
				else
				{
					break;
				}
			}
			if(count>1)
			{ 
				yesOrNo = true;
				System.out.print(strArr[i]);
				System.out.println(" count is " + count);
			}
			i=i+count-1;		
		}
		if(!yesOrNo)
		{
			System.out.println("theree are no duplicates");
			
		}
		

	}

}
