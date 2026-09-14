/**
 * File: PSGerund.java
 * -------------------------------------------
 * The PSGerund class converts a 
 * String into its present participle / gerund form.
 * 
 */

package com.popesoftware.util;

public class PSGerund
{	
	private static final Character[] vowelPrecedentCases = {'a','e','i','o','u'};
	private static Character lastLetter;
	private static Character secondToLastLetter;
	
	
	public static String createPresentParticiple(String word)
	{
		lastLetter = Character.toLowerCase(word.charAt(word.length()-1));
		secondToLastLetter = Character.toLowerCase(word.charAt(word.length()-2));
		
		if (!checkClientInputValidityFor(word)){ return word; }
		
		switch (lastLetter){
		case 'e':
			return handleEndingEFor(word);
		default:
			return handleEndingConsonantFor(word);
		}
	}
	
	
	private static boolean checkClientInputValidityFor(String word)
	{
		if (word.length() == 0) { return false; } 
		if (word.length() < 2) { return false; }
		for (int i = 0; i < word.length(); i++){
			boolean firstCase = word.charAt(i) < 65 || word.charAt(i) > 90;
			boolean secondCase = word.charAt(i) < 97 || word.charAt(i) > 122;
			if (firstCase && secondCase){ return false; }
		}
		return true;
	}
	
	
	private static String handleEndingEFor(String word)
	{
		for (Character vCase : vowelPrecedentCases){
			if (secondToLastLetter.equals(vCase)){
				return word.substring(0, word.length()) + "ing";
			} 
		}
		return word.substring(0, word.length()-1) + "ing";
	}
	
	
	private static String handleEndingConsonantFor(String word)
	{
		for (Character vCase : vowelPrecedentCases){
			if (secondToLastLetter.equals(vCase) && !lastLetter.equals('w')){
				return word.substring(0, word.length()) 
				+ word.charAt(word.length()-1) 
				+ "ing";
			} 
		}
		return word + "ing";
	}
}