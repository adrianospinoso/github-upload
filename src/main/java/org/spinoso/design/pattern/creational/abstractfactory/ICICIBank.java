package org.spinoso.design.pattern.creational.abstractfactory;

public class ICICIBank implements Bank {

	private final String BNAME;  
	ICICIBank(){  
		BNAME="ICICI BANK";  
	}  
	public String getBankName() {  
		return BNAME;  
	}  

}
