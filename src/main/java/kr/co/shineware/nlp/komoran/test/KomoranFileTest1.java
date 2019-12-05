package kr.co.shineware.nlp.komoran.test;

import kr.co.shineware.nlp.komoran.core.Komoran;


public class KomoranFileTest1 {
	public static void main(String[] args) throws Exception {

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
<<<<<<< HEAD
		String product = "26.레노버 아이디어패드 S340-15API R5 IPS";
=======
		String product = "25.애플 맥북프로 15형 2019년형 MV902KHA";
>>>>>>> branch 'master' of https://github.com/mafatofu/TeamProject01.git
		
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/nouns/result_" + product + ".txt";
		
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
<<<<<<< HEAD
		komoran.analyzeTextFile(inputFilename, outputFilename, 1);
=======
		//komoran.analyzeTextFile(inputFilename, outputFilename, 1);
>>>>>>> branch 'master' of https://github.com/mafatofu/TeamProject01.git
	}
}
