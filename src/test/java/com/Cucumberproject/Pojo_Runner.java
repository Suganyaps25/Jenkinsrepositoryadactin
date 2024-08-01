package com.Cucumberproject;

public class Pojo_Runner {

	public static void main(String[] args) {
		
		Pojo_Class s = new Pojo_Class();
		
		
		int[] v = {10,20,89,7900,3784545,5643789};
		s.setA(v);
		int[] a = s.getA();

		
		System.out.println("after setting the value");
		for(int i: a) {
		System.out.println(i);
		}

	
}
}