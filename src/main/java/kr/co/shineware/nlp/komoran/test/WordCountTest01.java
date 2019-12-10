package kr.co.shineware.nlp.komoran.test;

import java.io.IOException;

import kr.co.shineware.util.common.file.FileUtil;

public class WordCountTest01 {


	public static void main(String args[]) throws IOException {

		String product = "6.LG전자 그램 17 17ZD990-VX50K";
		String inputFilename = "resources/output/nouns/result_" + product + ".txt";
		String outputFilename = "resources/output/count/result_" + product + ".txt";
		FileUtil.mapCount(inputFilename, outputFilename, "UTF-8");
	}
}
