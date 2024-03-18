package loop;

import java.util.Scanner;
public class For01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int n=in.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}
		System.out.println("1부터 "+n+"까지의 합은"+sum+"입니다.");
		
		in.close();
	}

}
