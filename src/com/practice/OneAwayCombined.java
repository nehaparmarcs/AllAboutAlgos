package com.practice;

public class OneAwayCombined {

	public static void main(String[] args) {
		
		OneAwayCombined oac = new OneAwayCombined();
		System.out.println("Strings are one edit away ? "+oac.oneAway("Lake", "ake"));
		System.out.println("Strings are one edit away ? "+oac.oneAway("Lake", "Laes"));
		System.out.println("Strings are one edit away ? "+oac.oneAway("Lake", "Lame"));
	}
	
	public boolean oneAway(String str1, String str2){
		boolean replace = false;
		boolean edit = false;
		String first = null;
		String second = null;
		int index1 = 0;
		int index2 = 0;
		boolean foundDiff = false;
		
		if(str1.length() == str2.length()){
			replace = true;
			first = str1;
			second = str2;
		} else {
			first = str1.length() > str2.length()? str1: str2;
			second = str1.length() > str2.length() ? str2: str1; 
		}
		
		if(replace){
			while(index1< first.length() && index2 < second.length()){
				if(first.charAt(index1) == second.charAt(index2)){
					index1++; index2++;
					continue;
				} else {
					/* only one difference */
					if(foundDiff){
						return false;
					}
					foundDiff = true;
					index1++; index2++;
				}
			}
		} else {
			/* For delete or insert change */
			while(index1< first.length() && index2< second.length()){
				if(first.charAt(index1) == second.charAt(index2)){
					index1++; index2++;
					continue;
				} else {
					if(foundDiff){
						return false;
					}
					foundDiff  = true;
					index1++;
				}
			}
		}
		
		return true;
	}
}
