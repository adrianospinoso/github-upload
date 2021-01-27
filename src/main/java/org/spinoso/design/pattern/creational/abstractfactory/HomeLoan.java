package org.spinoso.design.pattern.creational.abstractfactory;

public class HomeLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		this.rate = rate;
	}
}
