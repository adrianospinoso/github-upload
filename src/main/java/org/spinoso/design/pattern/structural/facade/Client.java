package org.spinoso.design.pattern.structural.facade;

public class Client {

	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		converter.convertVideo("youtubevideo.ogg", "mp4");
	}
}
