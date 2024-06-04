package GameBasket;


public class ShopBasket 
{
    private String basket[];
    private int itemCount;

    public ShopBasket(int cap) 
    {
        basket = new String[cap];
        itemCount = 0;
    }

    public void addToBasket(String gameCode)
    {
        if (itemCount < basket.length) 
        {
            switch (gameCode)
            {
                case "A01":
                    basket[itemCount++] = "Call of Duty";
                    System.out.println("Call of Duty가 장바구니에 추가되었습니다." + "\n");
                    break;
                    
                case "A02":
                    basket[itemCount++] = "Warframe";
                    System.out.println("Warframe이 장바구니에 추가되었습니다." + "\n");
                    
                    break;
                    
                case "B01":
                    basket[itemCount++] = "Overwatch";
                    System.out.println("Overwatch가 장바구니에 추가되었습니다." + "\n");
                    break;
                    
                case "B02":
                    basket[itemCount++] = "Dark Souls";
                    System.out.println("Dark Souls가 장바구니에 추가되었습니다." + "\n");
                    break;
                    
                case "C01":
                    basket[itemCount++] = "Elden Ring";
                    System.out.println("Elden Ring이 장바구니에 추가되었습니다." + "\n");
                    break;
                    
                case "C02":
                    basket[itemCount++] = "Battlefield";
                    System.out.println("Battlefield가 장바구니에 추가되었습니다." + "\n");
                    break;
                    
                case "D01":
                    basket[itemCount++] = "Need for Speed";
                    System.out.println("Need for Speed가 장바구니에 추가되었습니다." + "\n");
                    break;
                    
                default:
                    System.out.println("유효하지 않은 게임 코드입니다." + "\n");
                    break;
            }
        } 
        else 
        {
            System.out.println("장바구니가 가득 찼습니다. 더 이상 추가할 수 없습니다.");
        }
    }

    public void showBasket()
    {
        if (itemCount == 0) 
        {
            System.out.println("장바구니가 비어있습니다.");
        } 
        else 
        {
            System.out.println("장바구니 내용:");
            for (int i = 0; i < itemCount; i++)
            {
                System.out.println(basket[i]);
            }
        }
    }
}
