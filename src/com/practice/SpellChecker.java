package com.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SpellChecker {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("/Users/Shaheen/Desktop/Shaheen/mytxtFile");
			BufferedReader br = new BufferedReader(fr);
			
			while(br.readLine() != null){
				System.out.println(br.readLine());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
