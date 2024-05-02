package chap06;

public class Girltest3
{
    public static void main(String[] args) 
    {
       Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};
       
       for(Girl g : girls)
       {
    	   g.show();
       }
    }
}

class Girl 
{
    protected String name;
    
    public Girl(String name)
    {
    	this.name = name;
    }
    
    public void show()
    {
    	System.out.println(name + "는 자바 초보자이다.");
    }
    
}

class GoodGirl extends Girl 
{
    public void show() 
    {
        System.out.println(name + "는 자바를 잘 안다.");
    }
    
    public GoodGirl(String name)
    {
    	super(name);
    }
}

class BestGirl extends GoodGirl 
{
    public void show() 
    {
        System.out.println(name +"는 자바를 무지하게 잘 안다.");
    }
    
    public BestGirl(String name) 
    {
	super(name);
    }
}