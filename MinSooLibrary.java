package NoOOPLibrary;

import java.util.Scanner;

public class MinSooLibrary
{
    static Scanner in = new Scanner(System.in);
    
    static String[][] bookList =
    {
         {"ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원"},
         {"ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원"},
         {"ID2403", "Do, It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스 퍼블리싱", "25,000원"}
    };
    
    static String cart[][] = new String[10][5];

    
    static void intro()
    {
    	  System.out.println("*****************************************");
          System.out.println("*    Welcome to Minsoo Book Market	*");
          System.out.println("*****************************************");
          System.out.println();
    }
    
    static void menu() 
    {
        System.out.println("=========================================");
        System.out.println("1. 도서 목록 보기");
        System.out.println("2. 장바구니 보기");
        System.out.println("3. 장바구니에 도서 추가");
        System.out.println("4. 장바구니 비우기");
        System.out.println("0. 종료");
        System.out.println("=========================================");
        System.out.print(">> 메뉴 선택 : ");
    }

    static void book_list() 
    {
        System.out.println("도서 목록");
        System.out.println("------------------------------------------------------------------------");
        for(int i=0; i<bookList.length; i++) 
        {
            for(int j=0; j<bookList[i].length; j++)
            {
                System.out.print(bookList[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------");
    }

    
    static void book_baguni() 
    {
        System.out.println(">> 장바구니");
        System.out.println("------------------------------------------------------------------------");
        if(cart[0][0]==null) 
        {
            System.out.println("장바구니가 비어 있습니다.");
        } 
        else 
        {
            for(int i=0; i<cart.length; i++) 
            {
                if(cart[i][0]!=null) 
                {
                    System.out.print((i+1) + "권, ");
                    for(int j=0; j<cart[i].length; j++) 
                    {
                        System.out.print(cart[i][j] + ", ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("------------------------------------------------------------------------");
    }

    
    static void book_add() 
    {
        System.out.println("도서 목록");
        System.out.println("------------------------------------------------------------------------");
        
        for(int i=0; i<bookList.length; i++) 
        {
            for(int j=0; j<bookList[i].length; j++) 
            {
                System.out.print(bookList[i][j] + " ");
            }
            System.out.println();
       
        }
        System.out.println("------------------------------------------------------------------------");

        System.out.print(">> 추가할 도서 ID 입력 : ");
        String Id=in.next();
        
        boolean isFound = false;
        
        for(int i=0; i<bookList.length; i++) 
        {
            for(int j=0; j<bookList[i].length; j++) 
            {
                if(Id.equals(bookList[i][0]))
                {
                	isFound = true;
                    System.out.println("장바구니 추가 : " + bookList[i][1]);
                    
                    for(int k=0; k<cart.length; k++) 
                    {
                        if(cart[k][0]==null) 
                        {
                            for(int l=0; l<bookList[i].length; l++) 
                            {
                                cart[k][l] = bookList[i][l];
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        }
        if(!isFound)
        {
        	System.out.println("없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
        }
    }

    
    static void book_reset() 
    {
        boolean isEmpty = true;
        
        for(int i=0; i<cart.length; i++) 
        {
            if(cart[i][0]!=null) 
            {
                cart[i] = null;
                isEmpty = false;
            }
        }
        if(isEmpty) 
        {
            System.out.println(">> 장바구니가 이미 비어 있습니다.");
        } 
        else 
        {
            System.out.println(">> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
        }
    }
    
    
    static void not_ex_menu() 
    {
    	System.out.println("\n없는 메뉴입니다. 0번부터 5번까지의 메뉴 중에서 선택하세요.\n");
    }
    
    
    static void end()
    {
    	System.out.println("Minsoo Book Market을 종료합니다.");
    }

    
    public static void main(String arg[]) 
    {
    	intro();
    	
        while(true) 
        {
            menu();
            int n=in.nextInt();

            switch(n) 
            {
                case 1:
                    book_list();
                    break;
                case 2:
                    book_baguni();
                    break;
                case 3:
                    book_add();
                    break;
                case 4:
                    book_reset();
                    break;
                case 0:
                	end();
                    return;
                default:
                    not_ex_menu();
            }
        }
    }
}
