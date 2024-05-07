package chap07;

public class TV implements Controller 
{
	private boolean power;
	
	public TV(boolean power) 
	{
        this.power = power;
    }
	
	public void show()
	{
		if(power)
		{
			System.out.println("TV가 켜졌습니다.");
		}
		else
		{
			System.out.println("TV가 꺼졌습니다.");
		}
		
	}
}
