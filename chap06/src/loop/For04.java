package loop;

import java.util.Scanner;
public class For04 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n = in.nextInt();
		
		int sum=1;
		
		for(int i=n; i>=1; i--)
		{
			sum*=i;
		}
		System.out.println(sum);
		
		in.close();
	}
}
