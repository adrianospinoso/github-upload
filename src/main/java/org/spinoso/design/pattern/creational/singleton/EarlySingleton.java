package org.spinoso.design.pattern.creational.singleton;

public class EarlySingleton {

	private static EarlySingleton istance = new EarlySingleton();
	
	private EarlySingleton() {}
	
	public static EarlySingleton getIstance() {
		return istance;
	}
}
