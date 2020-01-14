package kr.co.ca;

import java.util.ArrayList;
import java.util.stream.IntStream;

import com.naver.Test;

public class MainEx3 {

	public static void main(String[] args) {
		
		Test cat = new Test();
		
		int c  = cat.getCount();
		System.out.println(c);
		
		System.out.println("::::::::");
		
		// "Hello World"의 객체 msg를 생성하시오.
		
		String msg = new String("Hello World");
		
		int size = msg.length();
		System.out.println(size);
		
		IntStream stream = msg.chars();
		
		stream.close();
		
		System.out.println(":::::::::::");
		
		ArrayList<String> list = 
				new ArrayList<String>();
		
		size = list.size();
		System.out.println(size);
		
		
		
		
		
		
		
		
	}

}
