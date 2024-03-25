package chap03_Book;

import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		int n;
		
		do
		{
			System.out.print("숫자를 입력하세요 : ");
			n=in.nextInt();
			
			if(n%2==0)
			{
				sum+=n;
			}

		}while(n>0);
		
		System.out.println("지금까지 입력한 점수 중에서 짝수의 합은 "+sum+"입니다.");
		
		in.close();
	}

}