package loop;

import java.util.Scanner;
public class For05 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("양의 숫자를 입력하세요 : ");
		int sum=0;
		
		while(true)
		{
			int n = in.nextInt();
			
			if(n%2==1)
			{
				System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
			}
			else if(n<=0)
			{
				System.out.print("양의 숫자가 아닙니다. 다시 입력하세요 : ");
			}
			else if(n%2==0)
			{
				for(int i=1; i<=n; i++)
				{
					sum+=i;
				}
				System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
				break;
			}
			
		}
		
		in.close();
	}

}
