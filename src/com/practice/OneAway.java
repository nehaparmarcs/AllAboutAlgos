package com.practice;

import javax.crypto.spec.OAEPParameterSpec;

public class OneAway {

	public static void main(String[] args) {
		
	String input1 = "kle";
	String input2 = "ksle";
	OneAway oa = new OneAway();
	boolean oneEditDifferent = oa.oneEditAway(input1, input2);
	System.out.println("The strings are one edit away? "+ oneEditDifferent);

	}
	
	public boolean oneEditAway(String input1, String input2){
		
		if(input1.length() == input2.length()){
			return replaceAway(input1,input2);
		} else if(input1.length() + 1 == input2.length()){
			return changeAway(input1, input2);
		} else if (input1.length() - 1 == input2.length()){
			return changeAway(input2, input1);
		}
		
		return false;
	}
	
	public boolean replaceAway(String input1, String input2){
		boolean diffFound = false;
		int index1 = 0;
		int index2 = 0;
		while(index1< input1.length() && index2 < input2.length()){
			
			if(input1.charAt(index1) == input2.charAt(index2)){
				index1++; index2++;
				continue;
			}
			else{
				if(diffFound){
					/* more than one char match */
					return false;
				}
				diffFound = true;
			}
			index1++;
			index2++;
		}
	
		return diffFound;
	}
	
	public boolean changeAway(String input1, String input2){
		boolean diffFound = false;
		int index1 = 0;
		int index2 = 0;
		
		while (index1<input1.length() && index2 < input2.length()){
			
			if(input1.charAt(index1) == input2.charAt(index2)){
				index1++; index2++;
				continue;
			} else {
				if(diffFound){
					return false;
				}
				diffFound = true;
				index2++;
			}
		}
		
		return diffFound;
	}

}
