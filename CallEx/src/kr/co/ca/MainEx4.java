package kr.co.ca;

import com.naver.Test;

public class MainEx4 {

	public static void main(String[] args) {
		
		// Test 클래스를 이용하여 daum이라는 객체를 생성하시오.

		Test daum = new Test();
		
		//daum이 갖고 있는 getCount()메서드를 호출하시오.
		
		int d = daum.getCount();
		System.out.println(d);
		System.out.println("::::::::");
		
		// daum 객체가 갖고있는 setCount()매서드를 호출하시오.
		// 필요한 데이터가 있다면 24를 사용하시오.
		
		daum.setCount(24);
				
		// daum 객체가 갖고 있는 count 값을 출력하시오.
		
		d = daum.getCount();
		System.out.println(d);
		
	}

}
