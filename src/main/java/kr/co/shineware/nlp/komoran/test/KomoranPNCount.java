package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;

public class KomoranPNCount {
	public static void main(String[] args) {
		Komoran komoran = new Komoran("models_light");
		komoran.setUserDic("user_data/dic.user");
		
		String product = "1.LG전자 울트라PC 15U590-GA56K";

		String keyword = "weight";		

//		String inputFilename = "resources/input/" + product + ".txt";
//		String outputFilename = "resources/output/PNCount/" + product + "/" + keyword + ".txt";
		//문장별로 자른 것을 가지고 분석하기
		String inputFilename = "resources/output/0.sentence/sentence_" + product + ".txt";
		String outputFilename = "resources/output/2.PNCount/" + product + "/" + keyword + ".csv";
		
		//komoran.analyzeTextFile(inputFilename, outputFilename, 1);
		komoran.analyzeTextPNCount(inputFilename, outputFilename, 1, keyword);
	}
}

