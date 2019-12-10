package kr.co.shineware.nlp.komoran.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class SentenceTest {
	public static void main(String[] args) {
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/sentence/result_" + product + ".txt";

		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(inputFilename),StandardCharsets.UTF_8));
			BufferedWriter bw = new BufferedWriter(
                    (new OutputStreamWriter(new FileOutputStream(outputFilename), StandardCharsets.UTF_8)));
			String line = "";
			String[] array;
			

			while((line = br.readLine())!=null) {//읽고자 하는 라인이 null이 아닐때
				array = line.split("~|ㅋ|ㅎ|\\^|\\;|\\?|!|\\.");
				for (int i=0;i<array.length;i++) {
					bw.write(array[i].trim());
					bw.newLine();
				}
				
			}
			
			br.close();
			bw.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-----분석완료-----");
	}

}



