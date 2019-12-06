package kr.co.shineware.nlp.komoran.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import kr.co.shineware.util.common.file.FileUtil;

public class WordCountTest01 {


	public static void main(String args[]) throws IOException {

		String product = "6.LG전자 그램 17 17ZD990-VX50K";
		String inputFilename = "resources/output/nouns/result_" + product + ".txt";
		String outputFilename = "resources/output/count/result_" + product + ".txt";
		FileUtil.mapCount(inputFilename, outputFilename, "UTF-8");
		
//		Map<String, Integer> lines = FileUtil.mapCount(inputFilename, "UTF-8", outputFilename);
//
//		//갯수가 많은 순으로 정렬
//		//키와 벨류가 lines 안에 다 담겨있음
//		//
//		/*for(String key : lines.keySet()){
//			Integer value = lines.get(key);
//			System.out.println(key+" : "+value);
//		}*/
//		
//		//Iterator: 자바의 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법을 표준화하는 인터페이스
//		Iterator iterator = lines.keySet().iterator();
//		Iterator it = sortByValue(lines).iterator();
//
//		while(it.hasNext()) {
//			String temp = (String) it.next();
//			System.out.println(temp + " = " + lines.get(temp));
//		}
//	}
//	
//	//키목록을 리스트에 담고, 해당 리스트를 value기준으로 정렬
//	public static List sortByValue(final Map map) {
//		java.util.List<String> list = new ArrayList();
//		//리스트에 해쉬맵의 키값을 모두 넣음.
//		list.addAll(((HashMap<String, Integer>) map).keySet());
//
//		//리스트에서 두 값을 비교하여 정렬
//		Collections.sort(list, new Comparator() {
//			public int compare(Object o1, Object o2) {
//				Object v1 = ((HashMap<String, Integer>) map).get(o1);
//				Object v2 = ((HashMap<String, Integer>) map).get(o2);
//				return ((Comparable) v2).compareTo(v1);
//			}
//
//		});
//		//Collections.reverse(list); // 주석시 오름차순
//		return list;
	}
	

}
