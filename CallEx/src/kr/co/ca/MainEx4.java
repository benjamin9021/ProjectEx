package kr.co.ca;

import com.naver.Test;

public class MainEx4 {

	public static void main(String[] args) {
		
		// Test Ŭ������ �̿��Ͽ� daum�̶�� ��ü�� �����Ͻÿ�.

		Test daum = new Test();
		
		//daum�� ���� �ִ� getCount()�޼��带 ȣ���Ͻÿ�.
		
		int d = daum.getCount();
		System.out.println(d);
		System.out.println("::::::::");
		
		// daum ��ü�� �����ִ� setCount()�ż��带 ȣ���Ͻÿ�.
		// �ʿ��� �����Ͱ� �ִٸ� 24�� ����Ͻÿ�.
		
		daum.setCount(24);
				
		// daum ��ü�� ���� �ִ� count ���� ����Ͻÿ�.
		
		d = daum.getCount();
		System.out.println(d);
		
	}

}
