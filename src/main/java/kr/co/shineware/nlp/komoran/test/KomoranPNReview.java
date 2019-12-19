package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;


public class KomoranPNReview {
	public static void main(String[] args) {
		Komoran komoran = new Komoran("models_light");
		komoran.setUserDic("user_data/dic.user");
		
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		String keyword = "speed";		
		String inputFilename = "resources/output/0.sentence/sentence_" + product + ".txt";
		String outputFilename = "resources/output/3.PNReview/" + product + "/PNReview_" + keyword + ".tsv";
		
		komoran.analyzeTextPNReview(inputFilename, outputFilename, 1, keyword);
	}
}

