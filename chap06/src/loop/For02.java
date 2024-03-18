package loop;

import java.util.Scanner;
public class For02 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요.");
		
		int sum=0;
		
		for(int i=0; i<5; i++)
		{
			int n = in.nextInt();
			sum+=n;
		}
		System.out.println("5개 숫자의 합은 "+sum+"입니다.");
		
		in.close();
	}

}
