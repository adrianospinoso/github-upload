package org.spinoso.design.pattern.creational.factory.ex2;

public class DemoClienCodeMain {
	private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
    	String osName = System.getProperty("os.name");
    	System.out.println("OS name: " + osName);
        if (osName.equals("Windows 10")
        		|| osName.contentEquals("Linux")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
