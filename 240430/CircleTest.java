package chap06;

class Circle
{
	int radius;
	
	Circle(int radius)
	{
		this.radius = radius;
	}
	
	void show()
	{
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
}

class ColoredCircle extends Circle
{
	String color = "빨간색";
	
	ColoredCircle(int radius, String color)
	{
		super(radius);
	}
	
	void show()
	{
		System.out.println("반지름이 " + (radius*2) + "인 " + color +"원이다.");
	}
}

public class CircleTest 
{
    public static void main(String[] args) 
    {
        Circle circle = new Circle(5);
        
        circle.show();

        ColoredCircle coloredCircle = new ColoredCircle(5, "빨간색");
        
        coloredCircle.show();
    }
}
