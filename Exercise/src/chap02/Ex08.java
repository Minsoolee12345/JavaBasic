package chap02;

import java.util.Scanner;
public class Ex08 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int n = in.nextInt();
		
		int sum=0;

		while(n!=0)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.print(sum);
		in.close();
	}

}
