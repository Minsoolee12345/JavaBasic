package loop;

import java.util.Scanner;
public class For03 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = in.nextInt();
		
		for(int i=1; i<=9; i++)
		{
			System.out.println(n+"X"+i+"="+(n*i));
		}
		
		in.close();
	}
}
