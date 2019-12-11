package kr.co.shineware.nlp.komoran.test;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.util.common.file.FileUtil;
//입력파일을 읽고 품사별로 나누어 출력파일로 저장하는 클래스
public class KomoranFileTest1 {
	public static void main(String[] args) throws Exception {

		Komoran komoran = new Komoran("models_light");
		komoran.setFWDic("user_data/fwd.user");		komoran.setUserDic("user_data/dic.user");
		
		//String product = "1.LG전자 울트라PC 15U590-GA56K";
		//String inputFilename = "resources/input/" + product + ".txt";
		//String outputFilename = "resources/output/result_" + product + ".txt";
		String product = "result_1.LG전자 울트라PC 15U590-GA56K";
		String keyword = "speed";
		String inputFilename = "resources/output/sentence/" + product + ".txt";
		String outputFilename = "resources/output/result_" + product + ".txt";
		//komoran.analyzeTextFileMorph(inputFilename, outputFilename, 1);
		//komoran.analyzeTextFileNouns(inputFilename, outputFilename, 1);
		komoran.analyzeTextFile(inputFilename, outputFilename, 1);
		
		
	}
}	
