package chap06;

class Point
{
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString()
	{
		return "x=" + x + ", y=" + y;
	}
	
	Point(int x, int y)
	{
		this.x = x;
		this.y = y ;
	}
	
}

class MovablePoint extends Point
{
	private int xSpeed, ySpeed;

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	MovablePoint(int x, int y, int xSpeed, int ySpeed)
	{
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString()
	{
		return "x=" + getX() +", y=" + getY() +
				", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed;
	}
}

public class PointTest 
{
    public static void main(String[] args)
    {
        Point point = new Point(3, 4);
        System.out.println("좌표 " + point);

        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println("좌표 및 이동 속도 " + movablePoint);
    }
}