package com.naver;

public class Person2 {
	
	private Sonata[] sArr;
	private BMW[] bArr;
	
	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public Person2(Sonata[] sArr, BMW[] bArr) {
		super();
		this.sArr = sArr;
		this.bArr = bArr;
	}

	public Sonata[] getsArr() {
		return sArr;
	}

	public void setsArr(Sonata[] sArr) {
		this.sArr = sArr;
	}

	public BMW[] getbArr() {
		return bArr;
	}

	public void setbArr(BMW[] bArr) {
		this.bArr = bArr;
	}
	
	

	
	
}
