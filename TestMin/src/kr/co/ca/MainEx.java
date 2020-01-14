package kr.co.ca;

import com.naver.BMW;
import com.naver.Car;
import com.naver.Person3;
import com.naver.SM5;
import com.naver.Sonata;

public class MainEx {

	public static void main(String[] args) {

		
		Car c1 = new Car();
		Car c2 = new Sonata();
		Car c3 = new BMW();
		
		Car[] cArr = {c1,c2,c3,new Sonata()};
		
		Person3 min = new Person3(cArr);
		
		Car[] cArr2 = {c1,c2,c3,new Sonata(), new SM5()};
		
		min.setCar(cArr2);
		
		
		
		
		
		
	}

}
