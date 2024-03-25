package chap03_Book;

import java.util.Scanner;
public class Ex10 
{
	static boolean isPrime(int n)
	{
		int cnt = 0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2 || n==1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) 
	{
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		
		if(isPrime(num))
		{
			System.out.println(num+"는 소수입니다.");
		}
		else
		{
			System.out.println(num+"는 소수가 아닙니다.");
		}
	}
}
