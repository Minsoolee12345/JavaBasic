package select;

import java.util.Scanner;
public class If03 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int n = in.nextInt();
		
		if(n>0)
		{
			System.out.print("양수입니다.");
		}
		else if(n<0)
		{
			System.out.print("음수입니다.");
		}
		else
		{
			System.out.print("0 입니다.");
		}
		
		in.close();
	}

}
