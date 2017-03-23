package com.practice;

public class StringCompression {

	public static void main(String[] args) {
		StringCompression sc = new StringCompression();
		System.out.println(sc.getCompressedString("aaaaabbccccde"));
	}
	
	public String getCompressedString(String input){
		
		char[] ch = input.toCharArray();
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<ch.length; i++){
			
			if(i+1<ch.length){
				if((ch[i] == ch[i+1])){
					count++;
				}
				
				else {
					sb.append(ch[i]).append(count);
					count=1;
				}
				
			}else if(i==ch.length-1){
				sb.append(ch[i]).append(count);
				count=1;
			}
				
		}
		return sb.toString();
	}

}
