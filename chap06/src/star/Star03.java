package star;

import java.util.Scanner;
public class Star03 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=1; j--)
			{
				if(i<j)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		in.close();
	}
}
