package org.spinoso.design.pattern.creational.factory.ex1;

/**
 * Classe astratta
 * 
 * @author adriano
 *
 */
public abstract class Plan {

	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}
