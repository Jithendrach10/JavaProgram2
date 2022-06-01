package com.test;

public class JavaBasic{
     public static void main(String[] args) {
		String s = "Krishna";
		String s2 = "Krishna";
		//literal String (refer values, duplicate value obtain same memory location, we can't change value in memory location
		System.out.println("string Literal");
		System.out.println(System.identityHashCode(s));
	
	}
}
