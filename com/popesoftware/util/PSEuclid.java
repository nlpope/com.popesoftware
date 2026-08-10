/**
 * File: CS106A_EuclidianGCD.java
 * ----------------------------
 * The PSEuclid Java class calculates the greatest common
 * denominator (gcd) between two inputs. It is based
 * off of the Greek mathematician Euclid's algorithm.
 */

package com.popesoftware.util;

public class PSEuclid 
{		
	private int findGCD(int x, int y)
	{
		int r = x % y;
		//De Morgan's Law states that the below
		//loop exits when !(r != 0) or (r == 0)
		while (r != 0) {
			x = y;
			y = r;
			r = x % y;
		}
		return y;
	}
}