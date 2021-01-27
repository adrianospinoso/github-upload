package org.spinoso.design.pattern.structural.facade;

import java.io.File;

public class VideoConversionFacade {

	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);

		Codec destinationCodec;
		if(format.equals("mp4")) {
			destinationCodec = new OggCompressionCodec();
		}else {
			destinationCodec = new MPEG4CompressionCodec();
		}
		
		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermiateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermiateResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}
