package select;

import java.util.Scanner;
public class If05
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("숫자를 입력하세요 ");
			int n = in.nextInt();
			
			if(n>0)
			{
				if(n%2==0)
				{
					System.out.println("짝수입니다.");
				}
				else
				{
					System.out.println("홀수입니다.");
				}
			}
			else if(n<0)
			{
				System.out.println("양수가 아닙니다.");
			}
			else
			{
				System.out.println("프로그램 종료");
				in.close();
				break;
			}
		}
	}
}