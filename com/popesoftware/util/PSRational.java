/**
 * File: PSRational.java
 * ----------------------------
 * The PSRational class is used to represent rational numbers,
 * which are defined to e the quotient of two integers.
 * 
 * This code was modified from Eric Roberts' text 'The Art & 
 * Science of Java p.201.
 * */

package com.popesoftware.util;
public class PSRational
{
	public PSRational(int num,int den)
	{
		if (den == 0) {
			this.num = num;
			this.den = 0;
		} else { 
			int gcd = gcd(Math.abs(num), Math.abs(den));
			/** @ fail, gcd = 1 */
			this.num = num / gcd;
			this.den = Math.abs(den) / gcd;
			/** accounts for a negative input (negates to positive) */
			if (den < 0) this.num = -num;
		}
	}
	
	
	public PSRational(int n)
	{
		this(n,1);
	}
	
	
	public PSRational()
	{
		this(0);
	}
	
		
	/**
	 * Returns the sum of 2 rational numbers using rational arithmetic
	 * @param n The rational number you'd like to add to receiver
	 * @return The resulting rational number or integer if the result yields no remainder.
	 * */
	public PSRational add(PSRational n)
	{
		PSRational result = new PSRational(this.num * n.den + this.den * n.num, this.den * n.den);
		return result;
	}
	
	
	/* Method subtract */
	/**
	 * Returns the difference of 2 rational numbers using rational arithmetic.
	 * * @param n The rational number you'd like to subtract from receiver
	 * @return The resulting rational number or integer if the result yields no remainder
	 * */
	public PSRational subtract(PSRational n)
	{
		PSRational result = new PSRational(this.num * n.den - this.den * n.num, this.den * n.den);
		return result;
	}
	
	
	/**
	 * Returns the product of 2 rational numbers using rational arithmetic.
	 * @param n The rational number you'd like to multiply to receiver
	 * @return The resulting rational number
	 * */
	public PSRational multiply(PSRational n)
	{
		PSRational result = new PSRational(this.num * n.num, this.den * n.den);
		return result;
	}
	
	
	/**
	 * Returns the difference of 2 rational numbers using rational arithmetic.
	 * @param n The rational number you'd like to divide the receiver by
	 * @return The resulting rational number or integer if the result yields no remainder
	 * */
	public PSRational divide(PSRational n)
	{
		PSRational result = new PSRational(this.num * n.num, this.den * n.den);
		return result;
	}
	
	
	/**
	 * Calculates the Greatest Common Denominator using
	 * Euclid's Algorithm. This will be used to reduce
	 * the PSRational fraction to lowest terms.
	 * @param num The numerator of a rational number
	 * @param den The denominator of a rational number
	 * @return The greatest common divisor of num & den
	 * */
	private int gcd(int num, int den)
	{
		int r = num % den;
		while (r != 0) {
			num = den;
			den = r;
			r = num % den;
		}
		return den;
	}
	
	
	/**
	 * Creates a string representation of this rational number.
	 * This is what is referenced when 'println()' is passed this object.
	 * @return The string representation of this rational number.
	 * */
	public String toString()
	{
		if (den == 1) { return "" + num; }
		else if (den == 0) { return "infinity"; }
		else { return num + "/" + den; } 
	}
	
	/** Private instance variables */
	private int num; /** The numerator of this PSRational */
	private int den; /** The denominator of this PSRational */
}
