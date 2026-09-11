/**
 * File: PSTokens.java 
 * ------------------------------------------
 * This is only an non-functional version/example
 * of how the tokenizer/delimiter methods in CS106S_Consonant-
 * Detector work
 * 
 * */
package com.popesoftware.util;

/**
import acm.program.*;
import java.util.*;
*/
public class PSTokens  
{
	/** Named constnts */
	private static final String 
	DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	
	/*
	public void run()
	{
		println("This program takes a string and returns" +
				"it with all the english consonants uppercased.");
		String userString = readLine("Enter string: ");
		println(findConsonants(userString));
	}
	*/
	
	
	/**
	 * Converts a provided String into a format where the 
	 * consonants are uppercased and the vowels are lowercased.
	 * @param str String to be converted
	 * @return the converted String
	 * */
	/*
	private String findConsonants(String str)
	{
		StringTokenizer tokenizedStr = new StringTokenizer(
				str, DELIMITERS, true	
		);
		String result = "";
		while(tokenizedStr.hasMoreTokens()){
			String token = tokenizedStr.nextToken();
			if (isWord(token)) token = capConsonants(token);
			result += token;
		}
		
		return result;
	}
	*/
	
	
	/**
	 * Checks if token (a sequence of Characters regarded as
	 * a unit) is a word or just a delimiter (space or special char)
	 * @param token The token to be evaluated
	 * @return The boolean value stating whether token is a word
	 * */
	/*
	private boolean isWord(String token)
	{
		for(int i = 0; i < token.length(); i++){
			char ch = token.charAt(i);
			if (!Character.isLetter(ch)) return false;
		}
		return true;
	}
	*/
	
	
	/**
	 * Capitalizes every english consonant in a String.
	 * Lowercases every vowel in a String.
	 * @param str The string to be evaluated/changed
	 * @return the altered String
	 * */
	/*
	private String capConsonants(String str)
	{
		String result = "";
		for (int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if (isEnglishConsonant(ch)) ch = Character.toUpperCase(ch);
			else ch = Character.toLowerCase(ch);
			result += ch;
		}
		return result;
	}
	*/
	
	
	/**
	 * Evaluates whether a character is an English consonant or
	 * a vowel.
	 * @param ch The Character to be evaluated
	 * @return A boolean stating whether the Character is an English
	 * consonant
	 * */
	/*
	private boolean isEnglishConsonant(char ch)
	{
		switch (Character.toLowerCase(ch)) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				return false;
			default: 
					return true;
		}
	}
	*/
}

