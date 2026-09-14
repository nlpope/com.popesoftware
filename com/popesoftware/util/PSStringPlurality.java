/**
 * File: PSStringPlurality.java
 * ----------------------------
 * The PSStringPlurality class converts strings into their 
 * plural English counterparts. 
 * 
 * */

package com.popesoftware.util;

public class PSStringPlurality
{
	private static final Character[] lastLetterCases = {'s','x','z'};
	private static final String[] lastTwoLettersCases = {"ch","sh"};
	private static final Character[] yPrecendentCases = {'a','e','i','o','u'};
	
	public String makePlural(String strToPlural)
	{
		if (checkClientInputValidityFor(strToPlural)){
			return(createRegularPlural(strToPlural));
		}
		return strToPlural;
	}
	
	
	private boolean checkClientInputValidityFor(String word)
	{
		if (word.length() == 0) { return false; } 
		for (int i = 0; i < word.length(); i++){
			boolean firstCase = word.charAt(i) < 65 || word.charAt(i) > 90;
			boolean secondCase = word.charAt(i) < 97 || word.charAt(i) > 122;
			if (firstCase && secondCase){ return false; }
		}
		return true;
	}
	
	
	private String createRegularPlural(String word)
	{
		String lastTwoLetters = word.substring(word.length()-2).toLowerCase();
		Character lastLetter = Character.toLowerCase(word.charAt(word.length()-1));
		Character secondToLastLetter = Character.toLowerCase(word.charAt(word.length()-2));
		
		for (Character instance : lastLetterCases){
			if (lastLetter.equals(instance)){
				return word + "es";
			}
		}
		
		for (String instance : lastTwoLettersCases){
			if (lastTwoLetters.equals(instance)){
				return word + "es";
			}
		}
		
		for (Character instance : yPrecendentCases){
			if (lastLetter.equals('y') && secondToLastLetter.equals(instance)){
				return word.substring(0, word.length()-2) + "ies";
			}
		}
		
		return word + "s";
	}
}