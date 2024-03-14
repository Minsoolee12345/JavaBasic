package select;

import java.util.Scanner;
public class If01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하세요.");
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		
		int max = a;
		
		if(b>max)
		{
			max = b;
		}
		else if(c>max)
		{
			max = c;
		}
		
		System.out.println("가장 큰 수는 "+max+"입니다.");
		
		in.close();
	}
}


