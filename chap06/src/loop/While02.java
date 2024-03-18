package loop;

import java.util.Scanner;
public class While02 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int sum=0;
		
		while(true) 
		{
			System.out.print("숫자를 입력하세요 : ");
			int n = in.nextInt();
			sum+=n;
			if(n==0)
			{
				System.out.println("지금까지 입력한 숫자의 합은 "+sum+"입니다.");
				break;
			}
		}
		
		in.close();
	}

}
