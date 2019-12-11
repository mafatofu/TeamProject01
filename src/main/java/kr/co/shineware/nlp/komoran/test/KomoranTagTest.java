package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;

//언급량이 많은 키워드들에 대한 원하는 태그만 뽑아서 문장별로 출력하려는 메서드
//ex) 배송(형용사, 동사, 명사만): 늦, 빠른 ...
public class KomoranTagTest {
	public static void main(String[] args) throws Exception {
		
		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
		String keyword = "속도";
		String product = "result_1.LG전자 울트라PC 15U590-GA56K";
		String inputFilename = "resources/output/sentence/" + product + ".txt";
		String outputFilename = "resources/output/result_2222" + product + "("+keyword+").txt";
		
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
		komoran.analyzeTextTags(inputFilename, outputFilename, 1, keyword, 
			"VA", "MAG", "VV", "ETM", "ETN", "SN", "NNB", "JX", "JKB", "NNG", "XSV", "EC", "NNP", "XR", "XSA");
		//komoran.analyzeTextFile(inputFilename, outputFilename, 1);
		
		
	}
}
