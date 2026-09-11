/**
 * File: PSPlayingCard.java
 * ----------------------------
 * The PSPlayingCard class encapsulates the behavior
 * and state of a virtual playing card complete with
 * its own rank and suit enumerations. It is apart of 
 * the com.popesoftware.util package.
 */

package com.popesoftware.util;

public class PSPlayingCard 
{
	public enum Rank 
	{
		TWO(0), THREE(1), FOUR(2), FIVE(3), SIX(4), 
		SEVEN(5), EIGHT(6), NINE(7), TEN(8), JACK(9), QUEEN(10), KING(11), ACE(12);
		
		private final int value;
		
		Rank(int value)
		{
			this.value = value;
		}
		
		
		/**
		 * Returns the rank associated with a provided 
		 * numeric value.
		 * @pram value The numeric value of the rank enum
		 * @return The rank correlated with the client-
		 * provided value
		 * */
		public static Rank fromValue(int value)
		{
			for(Rank rank : Rank.values()){
				if (rank.value == value) return rank;
			}
			throw new IllegalArgumentException("No rank with value " + value);
		}
	}
	
	
	public enum Suit
	{
		Clubs(0), Diamonds(1), Hearts(2), Spades(3);
		
		private final int value;
		
		Suit(int value)
		{
			this.value = value;
		}
		
		
		/**
		 * Returns the suit associated with a provided 
		 * numeric value.
		 * @pram value The numeric value of a suit enum 
		 * @return The suit correlated with the client-
		 * provided value
		 * */
		public static Suit fromValue(int value)
		{
			for(Suit suit : Suit.values()){
				if (suit.value == value) return suit;
			}
			throw new IllegalArgumentException("No Suit with value " + value);
		}
	}
	
	
	public PSPlayingCard(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	
	public Rank getRank()
	{
		return this.rank;
	}
	
	
	public Suit getSuit()
	{
		return this.suit;
	}
	
	
	public String toString()
	{
		return "" + this.rank + this.suit;
	}
	
	public Rank rank;
	public Suit suit;
}
