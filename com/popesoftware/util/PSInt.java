/**
 * File: PSInt.java
 * ----------------------------
 * The PSInt class holds utilities for the Integer
 * wrapper such as:
 * 1. converts any integer into an ordinal String. 
 * 2. squares a client-provided number.
 * */

package com.popesoftware.util;

public class PSInt<T extends Integer> 
{
	T numberToChange;
	
	public PSInt(T numberToChange)
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
	
	
	public int toInt()
	{
		int intToReturn = (int) numberToChange;
		return intToReturn;
	}
}
