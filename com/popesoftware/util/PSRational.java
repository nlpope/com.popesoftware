/**
 * File: PSRational.java
 * ----------------------------
 * The PSRational class is used to represent rational numbers,
 * which are defined to be the quotient of two integers.
 * 
 * This code was modified from Eric Roberts' text 'The Art & 
 * Science of Java p.201.
 * */

package com.popesoftware.util;
import java.math.*;

public class PSRational
{
	/**
	 * Adding new private method as instructions prevented
	 * me from changing the original arguments / return types
	 * in existing public methods for this class.
	 * 
	 * see Eric Roberts' text 'Art & Science of Java' pg.220.
	 * */
	private PSRational(BigInteger num, BigInteger den)
	{
		if (den == BigInteger.ZERO) {
			this.num = new BigInteger(num.toString());
			this.den = BigInteger.ZERO;
		} else { 
			BigInteger gcd = gcd(num.abs(), den.abs());
			/** @ fail, gcd = 1 */
			BigInteger numGCDResult = num.divide(gcd);
			this.num = new BigInteger(numGCDResult.toString());
			BigInteger denGCDResult = den.abs().divide(gcd);
			this.den = new BigInteger(denGCDResult.toString());
			/** accounts for a negative input (negates to positive) */
			if (den.compareTo(BigInteger.ZERO) == -1) this.num = this.num.negate();
		}
	}
	
	
	public PSRational(Integer num,Integer den)
	{
		this(new BigInteger(num.toString()), new BigInteger(den.toString()));
	}
	
	
	public PSRational(Integer n)
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
		BigInteger biPSRationalNum = new BigInteger(n.num.toString());
		BigInteger biPSRationalDen = new BigInteger(n.den.toString());
		PSRational result = new PSRational(
				this.num.multiply(biPSRationalDen)
				.add(this.den.multiply(biPSRationalNum))  
				, this.den.multiply(biPSRationalDen)		
		);
		
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
		BigInteger biPSRationalNum = new BigInteger(n.num.toString());
		BigInteger biPSRationalDen = new BigInteger(n.den.toString());
		PSRational result = new PSRational(
				this.num.multiply(biPSRationalDen)
				.subtract(this.den.multiply(biPSRationalNum))  
				, this.den.multiply(biPSRationalDen)		
		);
		
		return result;
	}
	
	
	/**
	 * Returns the product of 2 rational numbers using rational arithmetic.
	 * @param n The rational number you'd like to multiply to receiver
	 * @return The resulting rational number
	 * */
	public PSRational multiply(PSRational n)
	{
		BigInteger biPSRationalNum = new BigInteger(n.num.toString());
		BigInteger biPSRationalDen = new BigInteger(n.den.toString());
		PSRational result = new PSRational(
				this.num.multiply(biPSRationalNum),
				this.den.multiply(biPSRationalDen)
		);
		return result;
	}
	
	
	/**
	 * Returns the quotient of 2 rational numbers using rational arithmetic.
	 * @param n The rational number you'd like to divide the receiver by
	 * @return The resulting rational number or integer if the result yields no remainder
	 * */
	public PSRational divide(PSRational n)
	{
		BigInteger biPSRationalNum = new BigInteger(n.num.toString());
		BigInteger biPSRationalDen = new BigInteger(n.den.toString());
		PSRational result = new PSRational(
				this.num.multiply(biPSRationalNum),
				this.den.multiply(biPSRationalDen)
		);
		
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
	private BigInteger gcd(BigInteger num, BigInteger den)
	{
		BigInteger r = num.mod(den);
		while (r != BigInteger.ZERO) {
			num = den;
			den = r;
			r = num.mod(den);
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
		if (den.compareTo(BigInteger.ONE) == 0) return "" + num; 
		else if (den.compareTo(BigInteger.ZERO) == 0) return "infinity";
		else { return num + "/" + den; } 
	}
	
	/** Private instance variables */
	private BigInteger num; /** The numerator of this PSRational */
	private BigInteger den; /** The denominator of this PSRational */
}
