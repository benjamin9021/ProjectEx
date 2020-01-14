package com.naver;

public class Person1 {

	private Sonata sonata;
	private BMW bmw;
	
	public Person1() {
		// TODO Auto-generated constructor stub
	}

	public Person1(Sonata sonata, BMW bmw) {
		super();
		this.sonata = sonata;
		this.bmw = bmw;
	}

	public Sonata getSonata() {
		return sonata;
	}

	public void setSonata(Sonata sonata) {
		this.sonata = sonata;
	}

	public BMW getBmw() {
		return bmw;
	}

	public void setBmw(BMW bmw) {
		this.bmw = bmw;
	}
	
	
	
}
