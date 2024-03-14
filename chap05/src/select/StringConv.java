package select;

import java.util.Scanner;
public class StringConv
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("세 개의 숫자를 입력하세요 : ");
		
		
		String str1 = in.next();
		String str2 = in.next();
		String str3 = in.next();
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int c = Integer.parseInt(str3);
		
		int max = a;
		
		if(b>max)
		{
			max = b;
		}
		else if(c>max)
		{
			max = c;
		}
		
		System.out.print("가장 큰 수는 "+ max + "입니다.");
		in.close();
	}
}