package GameStore_gList;

public class Game 
{
    public void gameList() 
    {
        String[] gameL = 
        	{
            "A01. Call of Duty",
            "A02. Warframe",
            "B01. Overwatch",
            "B02. Dark Souls",
            "C01. Elden Ring",
            "C02. Battlefield",
            "D01. Need for Speed"
        };

        for (String game : gameL) 
        {
            System.out.println(game);
        }
        System.out.println();
    }
}
