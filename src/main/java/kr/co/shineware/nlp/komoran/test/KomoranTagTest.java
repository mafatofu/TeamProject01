package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;

//언급량이 많은 키워드들에 대한 원하는 태그만 뽑아서 문장별로 출력하려는 메서드
//ex) 배송(형용사, 동사, 명사만): 늦, 빠른 ...
public class KomoranTagTest {
	public static void main(String[] args) throws Exception {
		
		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
		String keyword = "배송";
		String product = "6.LG전자 그램 17 17ZD990-VX50K";
		String inputFilename = "resources/output/0.sentence/sentence_" + product + ".txt";
		String outputFilename = "resources/output/TagTest/"+product+"/TagTest_" + product + "("+keyword+").txt";
		
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
		komoran.analyzeTextTags(inputFilename, outputFilename, 1, keyword, 
			"VA", "MAG", "VV", "ETM", "ETN", "SN", "NNB", "JX", "JKB", "NNG", "XSV", "EC", "NNP", "XR", "XSA");
		//komoran.analyzeTextFile(inputFilename, outputFilename, 1);
		
		
	}
}
