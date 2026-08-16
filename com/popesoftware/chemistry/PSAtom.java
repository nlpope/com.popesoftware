package com.popesoftware.chemistry;

public class PSAtom 
{
	boolean decaysThisYear;
	
	public PSAtom(boolean decaysThisYear)
	{
		this.decaysThisYear = decaysThisYear;
	}
	
	
	public void changeDecayBool(boolean decaysThisYear)
	{
		this.decaysThisYear = decaysThisYear;
	}
}
