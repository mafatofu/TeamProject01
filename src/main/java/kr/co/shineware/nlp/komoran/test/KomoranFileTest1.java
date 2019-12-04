package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;


public class KomoranFileTest1 {
	public static void main(String[] args) throws Exception {

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
		String product = "2.LG전자 그램 17 17ZD990-GX30K";
		
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/result_" + product + ".txt";
		
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
		komoran.analyzeTextFile(inputFilename, outputFilename, 1);
	}
}
