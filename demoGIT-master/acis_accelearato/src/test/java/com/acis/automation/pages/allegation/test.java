package com.acis.automation.pages.allegation;

import java.util.Random;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class test extends PageBase {
	public test() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String generateRandomString() {
		String alphabet = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		int n = alphabet.length();
		Random r = new Random();

		String strRandom = "";
		for (int i = 0; i < 6; i++) {
			strRandom = strRandom + alphabet.charAt(r.nextInt(n));
		}
		return strRandom;
	}

	public static void main(String[] args) throws AcisException {
		
		test t = new test();
		t.generateRandomString();
		System.out.println(t.generateRandomString());
		
	}

}
