/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Loop
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 *
 * @author            : ksw10
 * @version           : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int agg =100;
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("--------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("--------------------");
			
			System.out.println("메뉴 입력 => ");
			int choice;
			choice = scanner.nextInt();
			if(choice == 1)
			{
				agg+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + agg);
			}
			else if(choice == 2)
			{
				agg-=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + agg);
			}
			else if(choice == 3)
			{
				int num = new Random().nextInt(4);
				if(num==1)
				{
					System.out.println("기사(으)로 설정되었습니다.");
				}
				else if(num == 2)
				{
					System.out.println("영주(으)로 설정되었습니다.");
				}
				else if(num == 3)
				{
					System.out.println("농민(으)로 설정되었습니다.");
				}
				else if(num == 0)
				{
					System.out.println("마법사(으)로 설정되었습니다.");
				}
			}
			else if(choice == 9)
			{
				break;
			}
			else
			{
				System.out.println("없는 메뉴입니다!");
			}
			try

			{

			Thread.sleep(1000);

			}

			catch(InterruptedException e)

			{   System.err.println(e); 	}

		}
		scanner.close();
		System.out.println("이제 공부하세요!");
	}

}
