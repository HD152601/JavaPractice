/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_CarTest
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author		: a
 * @version		: 1.0
 */
public class CarTest3 {
	public static void main(String[] args) {
		
	
		Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("<<자동차 목록>>");
		System.out.println("제조사명 : "+car1.getCompany());
		System.out.println("모델명 : "+car1.getModel());
		System.out.println("색상 : "+car1.getColor());
		System.out.println("최대속도 : "+car1.getMaxSpeed()+"km");
		System.out.println("가격  : "+ String.format("%,d", car1.getPrice())+"원");
		System.out.println("");
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getMaxSpeed()+"km");
		System.out.println("가격  : "+ String.format("%,d", car2.getPrice())+"원");
		System.out.println("");
		System.out.println("제조사명 : "+car3.getCompany());
		System.out.println("모델명 : "+car3.getModel());
		System.out.println("색상 : "+car3.getColor());
		System.out.println("최대속도 : "+car3.getMaxSpeed()+"km");
		System.out.println("가격  : "+ String.format("%,d", car3.getPrice())+"원");
		
		
		
		
		
		
		
		
	}
}
