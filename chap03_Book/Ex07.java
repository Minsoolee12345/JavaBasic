package chap03_Book;

import java.util.Scanner;

public class Ex07 
{
	
	static void whosWin(String str1, String str2)
	{
		 if (str1.equals(str2)) 
	        {
	            System.out.println("무승부!");
	        } 
	        else if ((str1.equals("s") && str2.equals("r")) || 
	        		(str1.equals("r") && str2.equals("p")) || 
	        		(str1.equals("p") && str2.equals("s"))) 
	        {
	            System.out.println("영희, 승!");
	        } 
	        else 
	        {
	            System.out.println("철수, 승!");
	        }
	}
	
	
	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);

	        System.out.print("철수 : ");
	        String str1 = in.next();

	        System.out.print("영희 : ");
	        String str2 = in.next();
        
	        whosWin(str1,str2);

	        in.close();
	}
}
