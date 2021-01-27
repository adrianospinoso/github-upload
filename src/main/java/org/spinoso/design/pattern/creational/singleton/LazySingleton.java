package org.spinoso.design.pattern.creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8780139684414489418L;


	private static LazySingleton instance;

	private LazySingleton() {}

	public static LazySingleton getInstance() {
		if(instance == null) {

			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		
		return instance;
	}
	
	protected LazySingleton readResolve() {
		return getInstance();
	}
}
