package chap07;

public abstract class TalkableTest 
{
	static void speak(Talkable t)
	{
		t.talk();
	}
	
	public static void main(String arg[])
	{
		speak(new Korean());
		speak(new American());
	}

}
