/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 *
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 *
 * @author            : ksw10309
 * @version           : 1.0
 */
public class PrimitiveDataType {
	public static void main (String args[])
	{
		System.out.println("<<아이유 프로필>>");
		
		String name = "아이유";
		System.out.println("이름 : " + name);
		System.out.print("성별 : ");
		boolean isMale = false;
		if(!isMale)
		{
			System.out.println("여자");
		}
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		System.out.println("나이 : " + age + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
	}
}
