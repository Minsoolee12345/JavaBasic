package chap03_Book;

public class Ex05 
{
    public static void main(String[] args) 
    {
       for(int a=1; a<=20; a++)
       {
    	   for(int b=1; b<=20; b++)
    	   {
    		   for(int c=1; c<=20; c++)
    		   {
    			   if(a*a + b*b == c*c && a+b+c>=20)
    			   {
    				   System.out.println(a+" "+b+" "+c);
    			   }
    		   }
    	   }
       }
    }
}
