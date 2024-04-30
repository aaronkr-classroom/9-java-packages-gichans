package com.section03;

import com.javamaster.mypackage.Cat;

public class Ex1004 {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		System.out.println(cat1.equals(cat2));
		
		cat1 = cat2;
		System.out.println(cat1.equals(cat2));
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		
		String str1 = cat1.scratch();
		String str2 = cat2.meow();
		String str3 = cat2.scratch();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		public String scratch() {
			String result = "먹이를 먹다";
			System.out.println(result);
			return result;
		}
		
		public String meow() {
			String result = "발톱으로 할퀴다";
			System.out.println(result);
			return result;
		}
		public String scratch() {
			String result = "야옹하고 울다";
			System.out.println(result);
			return result;
			
		}

	}

}
