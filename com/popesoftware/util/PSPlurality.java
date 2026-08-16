/**
 * File: PSPlurality.java
 * ----------------------------
 * The PSPlurality class converts integers into ordinal 
 * Strings. And back to type Int should storage purposes
 * deem it fitting. 
 * */

package com.popesoftware.util;

public class PSPlurality<T extends Integer> 
{
	T numberToChange;
	
	public PSPlurality(T numberToChange)
	{
		this.numberToChange = numberToChange;
	}
	
	
	public String makeOrdinal()
	{
		if (numberToChange == 0) return ""; //for this line we must Extend Integer (wrapper for int)
		switch (numberToChange % 10){
		case 1:
			return numberToChange + "st";
		case 2:
			return numberToChange + "nd";
		case 3:
			return numberToChange + "rd";
		default: 
			return numberToChange + "th";
		}
	}
	
	
	public String handlePluralTense()
	{
		String result;
		if (this.numberToChange == 1 || this.numberToChange == -1) {
			result = " is "; 
		} else { 
			result = " are ";
		}
		return result;
	}
	
	
	public String handlePluralEnding()
	{
		String result; 
		if (this.numberToChange == 1 || this.numberToChange == -1) {
			result = "";
		} else { 
			result = "s";
		}
		return result;
	}
	
	
	public int toInt()
	{
		int intToReturn = (int) numberToChange;
		return intToReturn;
	}
}
