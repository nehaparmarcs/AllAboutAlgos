package com.practice;

public class AllUnique {
	
	public static void main(String[] args) {
		System.out.println("Something : "+AllUnique.allUnique("SomeString"));
		System.out.println("abcdefg : "+AllUnique.allUnique("abcdefg"));
	}
	
	public static boolean allUnique(String input){
		
		char[] inputArr = input.toCharArray();
		
		//Remember that the char has to appear just once
		for(int i=0; i<inputArr.length;i++){
			if(i != input.lastIndexOf(inputArr[i])){
				return false;
			}
		}
		return true;
	}
}
