package org.spinoso.design.pattern.creational.factory.ex2;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

}
