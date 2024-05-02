package chap06;

public class OverrideTest 
{
	public static void main(String[] args) 
	{
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();
	}
}

class Vehicle 
{
	String color;
	int speed;
	
	
	public Vehicle(String color, int speed)
	{
		this.color = color;
		this.speed = speed;
	}
	
	void show()
	{
		System.out.println("색깔 : " + color + 
				" , " + "속도 : " + speed);
	}
}

class Car extends Vehicle
{
	int displacement;
	int gears;
	
	
	public Car(String color, int speed, int displacement, int gears)
	{
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
	
	void show()
	{
		System.out.println("색깔 : " + color + 
				" , " + "속도 : " + speed 
				+ "배기량 : " + displacement
				+ "기어 : " + gears);
	}
}
