/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author            : ksw10
 * @version           : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int mon = 1700000;
		int per = 3;
		int num = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.print("월 평균 급여 : ");
		System.out.println(String.format("%,d", mon));
		System.out.print("점포 내 직원 수 : ");
		System.out.println(String.format("%,d", per));
		System.out.print("점포 수 : ");
		System.out.println(String.format("%,d", num));
		System.out.println("");
		System.out.print("연간 인건 비 : ");
		long sum =(long)mon * 12 * per * num;
		System.out.println(String.format("%,d", sum));
	}

}
