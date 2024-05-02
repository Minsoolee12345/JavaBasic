package chap06;

public class PhoneTest 
{
	public static void main(String[] args) 
	{
		Phone[] phones = {new Phone("황진이"), new TelePhone("길동이","내일"), new SmartPhone("민국이","갤러그")};
		
		for(Phone p : phones)
		{
		    if(p instanceof SmartPhone) 
		    {
		        SmartPhone smartPhone = (SmartPhone) p;
		        smartPhone.playGame();
		    } 
		    
		    else if(p instanceof TelePhone) 
		    {
		        TelePhone telePhone = (TelePhone) p;
		        telePhone.autoAnswering();
		    } 
		    
		    else 
		    {
		        p.talk();
		    }
		}
	}
}

class Phone
{
	protected String owner;
	public Phone(String owner) 
	{
		this.owner = owner;
	}
	void talk()
	{
		System.out.println(owner + "가 통화 중이다.");
	}
}

class TelePhone extends Phone
{
	private String when;
	public TelePhone(String owner, String when) 
	{
		super(owner);
		this.when = when;
	}
	
	void autoAnswering()
	{
		System.out.println(owner + "가 없다." + when + "전화 줄래.");
	}
}

class SmartPhone extends TelePhone
{
	private String game;
	public SmartPhone(String owner, String game) 
	{
		super(owner, game);
		this.game = game;
		
	}
	
	void playGame()
	{
		System.out.println(owner + "가 " + game + " 게임을 하는 중이다.");
	}
}