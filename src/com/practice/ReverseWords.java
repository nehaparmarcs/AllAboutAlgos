package com.practice;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "Someday maybe will finish";
		ReverseWords rw = new ReverseWords();
		rw.reverseStr(new StringBuilder(str).reverse().toString().toCharArray(), 0, 0);
		
	}
	
	
	public void reverseStr(char[] arr, int start, int end){
		
		for (int i=0; i<arr.length;i++){
			if(arr[i]== ' '){
				
			}
		}
	}
	
	
	public void reverse(char[] array, int start, int end){
		
	}
	
}
