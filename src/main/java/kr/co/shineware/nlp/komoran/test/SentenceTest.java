package kr.co.shineware.nlp.komoran.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

//문장 나누기 클래스
public class SentenceTest {
	public static void main(String[] args) {
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		String inputFilename = "resources/input/" + product + ".txt";
		String outputFilename = "resources/output/sentence/result_" + product + ".txt";
		
		//파일 입출력
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(inputFilename),StandardCharsets.UTF_8));
			BufferedWriter bw = new BufferedWriter(
                    (new OutputStreamWriter(new FileOutputStream(outputFilename), StandardCharsets.UTF_8)));
			String line = "";
			String[] array;
			
			
			while((line = br.readLine())!=null) {//읽고자 하는 라인이 null이 아닐때
				//해당 문자들이 포함되어있으면, 다음 라인으로 내리기
				array = line.split("~|ㅋ|ㅎ|\\^|\\;|\\?|!|\\.");
				for (int i=0;i<array.length;i++) {
					//array는 line 문자열을 해당 문자들 기준으로 잘라낸 문자열배열이다. 전부 출력해줘야 원래 문장이 다 나온다.
					bw.write(array[i].trim()); //문자열 양 옆의 공백 없애기
					bw.newLine();
				}
				
			}
			
			br.close();
			bw.close(); //닫아주지 않으면 문장이 제대로 들어가지 않는다.
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-----분석완료-----");
	}

}



