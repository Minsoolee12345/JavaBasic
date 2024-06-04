package GameStore_Controller;

import java.util.Scanner;

import GameBasket.ShopBasket;
import GameStore_Show.Show;
import GameStore_gList.Game;

public class Main
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		
		Show show = new Show();
		Game game = new Game();
		ShopBasket shop = new ShopBasket(10);

		show.welcome();

		int menu;

		 do {
			 	show.MenuList();
			 	
			 	System.out.println();
				System.out.print("메뉴를 입력하세요 : ");
				
	            menu = in.nextInt();
	            switch (menu) 
	            {
	                case 0:
	                    System.out.println("\n" + "종료합니다."); break;
	                    
	                case 1:

	                    System.out.println("\n" + "게임 정보 보기를 선택하셨습니다." + "\n"); 
	                    game.gameList();
	                    break;
	                   
	                case 2:
	                    System.out.println("\n" + "장바구니 보기를 선택하셨습니다." + "\n"); 
	                    shop.showBasket();
	                    break;
	                   
	                    
	                case 3:
	                	System.out.print("게임 고유코드를 입력하세요 : ");
	                	String code = in.next();
	                    System.out.println("\n" + "장바구니에 게임 추가를 선택하셨습니다." + "\n");
	                    shop.addToBasket(code);
	                    break;
	                    
	                    
	                case 4:
	                    System.out.println("\n" + "장바구니 게임 삭제를 선택하셨습니다."); break;
	                    // 장바구니 도서 삭제 기능 추가
	                    
	                case 5:
	                    System.out.println("\n" + "장바구니 비우기를 선택하셨습니다.");  break;
	                    // 장바구니 비우기 기능 추가
	                   
	                default:
	                    System.out.print("\n" + "잘못된 입력입니다. 다시 선택해주세요. : ");  break;
	            }
	        } while (menu != 0);
	}
}
