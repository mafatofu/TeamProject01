package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.util.common.file.FileUtil;

public class KomoranWordCount {
		
	public static void main(String[] args) {
		
		//단순 단어별 카운트
		String product = "2.LG전자 그램 17 17ZD990-GX30K";
		
		String inputFilename = "resources/output/nouns/result_" + product + ".txt";
		String outputFilename = "resources/output/result_" + product + ".txt";
		FileUtil.mapCount(inputFilename, outputFilename, "UTF-8");
	
	}	
}
	
