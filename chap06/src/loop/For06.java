package loop;

import java.util.Scanner;
public class For06 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=2; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		in.close();
	}
}
