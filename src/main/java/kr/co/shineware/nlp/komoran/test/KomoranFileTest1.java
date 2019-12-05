package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;


public class KomoranFileTest1 {
	public static void main(String[] args) throws Exception {

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
		String product = "25.애플 맥북프로 15형 2019년형 MV902KHA";
		
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/nouns/result_" + product + ".txt";
		
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFile(inputFilename, outputFilename, 1);
	}
}
