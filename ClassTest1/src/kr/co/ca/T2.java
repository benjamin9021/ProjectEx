package kr.co.ca;

import com.naver.Dog;
import com.naver.T3;

public class T2 {
	private int a;
	private int b;
	private String c;
	private Dog d;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public Dog getD() {
		return d;
	}

	public void setD(Dog d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	private int e;
	
	public void me1() {
		e=100;
		System.out.println(e);
		
		T3 t3 = new T3();
		t3.setA=10000;
	}

	
}
