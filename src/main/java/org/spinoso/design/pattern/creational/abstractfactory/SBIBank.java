package org.spinoso.design.pattern.creational.abstractfactory;

public class SBIBank implements Bank {

	private final String BNAME;  
	public SBIBank(){  
		BNAME="SBI BANK";  
	}  
	public String getBankName(){  
		return BNAME;  
	}  

}
