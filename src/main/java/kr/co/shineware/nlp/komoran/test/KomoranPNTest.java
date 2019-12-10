package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;

public class KomoranPNTest {
	public static void main(String[] args) {
		Komoran komoran = new Komoran("models_light");
		komoran.setUserDic("user_data/dic.user");
		
		String product = "1.LG전자 울트라PC 15U590-GA56K";

		String keyword = "speed";
		

		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/rank/" + product + "/" + keyword + ".txt";
		komoran.analyzeTextPN(inputFilename, outputFilename, 1, keyword);
	}
}

