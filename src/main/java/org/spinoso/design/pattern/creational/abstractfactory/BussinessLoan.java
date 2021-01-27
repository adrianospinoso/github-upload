package org.spinoso.design.pattern.creational.abstractfactory;

public class BussinessLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;
		
	}

}
