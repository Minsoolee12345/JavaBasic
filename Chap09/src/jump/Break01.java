package jump;

import java.util.Scanner;
public class Break01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int num;
		
		while (true) 
		{
			System.out.print("숫자 입력 : ");
			num=in.nextInt();
			
			if(num>0)
			{
				int sum=0;
				
				for(int i = 1; i <= num; i++)
				{
					sum += i;
				}
				
				System.out.println("1부터 " + num + "까지의 합 : " + sum);
			}
			
			if(num<=0)
			{
				System.out.println("0보다 큰 숫자를 입력하세요");
				continue;
			}
		}
		

	}
}
