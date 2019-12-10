package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;

public class KomoranPNTest {
	public static void main(String[] args) {
		Komoran komoran = new Komoran("models_light");
		komoran.setUserDic("user_data/dic.user");
		
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/result_" + product + ".txt";
		komoran.analyzeTextPN(inputFilename, outputFilename, 1, "shipping");

		
	    System.out.println("============긍정=============");  
		for (String key : CountPNTest.phashmap.keySet()) {
	          int v = CountPNTest.phashmap.get(key);
	          System.out.println(key+":"+v);
	       }
	       System.out.println("============부정=============");
	       for (String key : CountPNTest.nhashmap.keySet()) {
	          int vv = CountPNTest.nhashmap.get(key);
	          System.out.println(key+":"+vv);
	          //커밋테스트
	       }
	}
}
