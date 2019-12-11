package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;

public class KomoranKeywordTags {
	public static void main(String[] args) throws Exception {

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
		String keyword = "비싸";
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/result_2222" + product + "("+keyword+").txt";
		
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
		komoran.analyzeTextTags(inputFilename, outputFilename, 1, keyword, 
			"VA", "MAG", "VV", "ETM", "ETN", "SN", "NNB", "JX", "JKB", "NNG", "XSV", "EC", "NNP", "XR", "XSA");
		//komoran.analyzeTextFile(inputFilename, outputFilename, 1);
		
		
	}
}
