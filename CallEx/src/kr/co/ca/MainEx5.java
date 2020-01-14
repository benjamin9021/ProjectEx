package kr.co.ca;

public class MainEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = new String("Hello");
		// Hello - > Good으로 바꾸어주는 메소드가
		// String에 있습니다.
		// re~() *hint*
		msg = msg.replace("Hello", "Good");
		System.out.println(msg);
		
		System.out.println("::::::Good으로 바뀜");

		// 인덱스가 0인 문자는 무엇인지 찾아서 출력하시오.
		
		char c0 = msg.charAt(0);
		System.out.println(c0);
		System.out.println("::::::::::::::::::");
		
		// msg 객체의 indexof() 메서드를 호출하시오
		
		int idx = msg.indexOf('o');
		System.out.println(idx);
		
		idx = msg.indexOf("oo");
		System.out.println(idx);
		
		
	}

}
