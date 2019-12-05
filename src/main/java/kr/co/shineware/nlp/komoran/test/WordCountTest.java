package kr.co.shineware.nlp.komoran.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kr.co.shineware.util.common.file.FileUtil;

public class WordCountTest {
	
	public static void main(String[] args) {
		
		//Komoran komoran = new Komoran("models_light");
		
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		
		//String inputFilename = "resources/input/" + product + ".txt";
		String inputFilename = "resources/output/nouns/result_" + product + ".txt";
		//String outputFilename = "resources/output/count/result_" + product + ".txt";
		
		Map<String, Integer> lines = FileUtil.mapCount(inputFilename, "UTF-8");
        
//		Value bvc = new Value(lines);
//        TreeMap<String,Integer>sorted_map = new TreeMap<String,Integer>(bvc);
//        int cnt = 0;            
//        
//        for(String item : sorted_map.keySet()){
//        	cnt = lines.get(item);
//        	System.out.println(item+" \t"+cnt);
//        }
		Iterator<String> it = sortByValue(lines).iterator();
				
//		HashMap<String, Integer> lines = FileUtil.mapCount(inputFilename, "UTF-8");
//			
//		for(String key : lines.keySet()){
//			 
//            Integer value = lines.get(key);
// 
//            System.out.println(key+" : "+value);
// 
//        }	
		while(it.hasNext()) {

			String temp = (String) it.next();

			System.out.println(temp + " = " + lines.get(temp));

			}
	}
	public static List<String> sortByValue(final Map<String, Integer> map) {

		List<String> list = new ArrayList<String>();
		list.addAll(map.keySet());

		Collections.sort(list,new Comparator<Object>() {
			public int compare(Object o1,Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable) v2).compareTo(v1);
			}
		});

		//Collections.reverse(list); // 주석시 오름차순
		return list;
		
	}
}




