package com.practice;

import java.util.HashSet;

public class LibExamples {

	public static void main(String[] args) {
		
		//HastSet Demo
		HashSet<String> hs = new HashSet<>();
		String[] arr = "What goes around comes around".split(" ");
		for(String st: arr){
			hs.add(st);
		}
		
		System.out.println(hs.size());
		
	}
}
