package kr.co.shineware.nlp.komoran.test;

import java.util.List;

import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import kr.co.shineware.nlp.komoran.model.Token;

public class KomoranFileTest1 {
	public static void main(String[] args) throws Exception {

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");
		komoran.setUserDic("user_data/dic.user");
		//komoran.setUserDic("user_data/wiki.titles");
		//String input = "소녀시대와 원더걸스, 카라, AOA 중 원픽은?";
		
		
		String inputFilename = "resources/input/reviewdata.txt";
		String outputFilename = "resources/output/result.txt";
		
		komoran.analyzeTextFile(inputFilename, outputFilename, 1);
//		List<Token> tokenList = analyzeResultList.getTokenList();

		//print each tokens by getTokenList()
//		System.out.println("==========print 'getTokenList()'==========");
//		for (Token token : tokenList) {
//			System.out.println(token);
//			System.out.println(token.getMorph()+"/"+token.getPos()+"("+token.getBeginIndex()+","+token.getEndIndex()+")");
//			System.out.println();
//		}
//		//print nouns
//		System.out.println("==========print 'getNouns()'==========");
//		System.out.println(analyzeResultList.getNouns());
//		System.out.println();
//		System.out.println("==========print 'getPlainText()'==========");
//		System.out.println(analyzeResultList.getPlainText());
//		System.out.println();
//		System.out.println("==========print 'getList()'==========");
//		System.out.println(analyzeResultList.getList());
	}
}
