package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.constant.SYMBOL;
import kr.co.shineware.nlp.komoran.core.Komoran;


public class KomoranFileTest1 {
	public static void main(String[] args) throws Exception {
		
		/*
		 * 	public static final String START = "BOE";
			public static final String END = "EOE";
			public static final String SPACE = "<sp>";
			public static final String NA = "NA";
			
			public static final String NUMBER = "<number>";
			public static final String SW = "SW";
			public static final String SF = "SF";
			public static final String EC = "EC";
			public static final String EF = "EF";
			public static final String JKO = "JKO";
			public static final String JX = "JX";
			public static final String ETM = "ETM";
			public static final String JKS = "JKS";
			public static final String JKC = "JKC";
			public static final String IRREGULAR = "IRR";
			public static final int IRREGULAR_ID = -1;
			public static final String SS = "SS";
			public static final String NNG = "NNG";
			public static final String NNP = "NNP";
			public static final String NNB = "NNB";
		 */		

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/nouns/result_" + product + ".txt";
		
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFile(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFileTags(inputFilename, outputFilename, 1, SYMBOL.SS,SYMBOL.ETM);
	}
}
