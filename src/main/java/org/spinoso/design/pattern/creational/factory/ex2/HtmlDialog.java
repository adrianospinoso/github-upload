package org.spinoso.design.pattern.creational.factory.ex2;


public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
