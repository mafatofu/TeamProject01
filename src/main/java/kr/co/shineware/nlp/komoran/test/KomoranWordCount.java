package kr.co.shineware.nlp.komoran.test;

import java.io.IOException;

import kr.co.shineware.util.common.file.FileUtil;

public class KomoranWordCount {
		
	public static void main(String[] args) throws IOException {
		
		//단순 단어별 카운트
		String product = "6.LG전자 그램 17 17ZD990-VX50K";
		
		String inputFilename = "resources/output/1.nouns/nouns_" + product + ".txt";
		String outputFilename = "resources/output/1-1.WordCount/WordCount_" + product + ".csv";
		FileUtil.mapCount(inputFilename, outputFilename, "UTF-8");
	
	}	
}
	
