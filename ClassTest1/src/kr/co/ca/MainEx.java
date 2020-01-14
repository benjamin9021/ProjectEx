package kr.co.ca;

import com.naver.Car;
import com.naver.CarDTO;
import com.naver.Face;

public class MainEx {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		Face f1 = new Face();
		CarDTO cdto1 = new CarDTO();
		
		System.out.println(cdto1.getCarColor());
		cdto1.setCarColor(new String("red"));
		
		
		System.out.println(cdto1.getCarColor());
		
		
		
		T2 t2 = new T2();
		System.out.println(t2.getA());
		t2.setA(77);
		
		System.out.println(t2.getE());
		t2.setE(10000);
	
	}
}
