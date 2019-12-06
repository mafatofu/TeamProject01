package kr.co.shineware.nlp.komoran.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import kr.co.shineware.util.common.file.FileUtil;

public class WourdCountTest2 {
		
	public static void main(String[] args) throws IOException {
		
		String product = "2.LG전자 그램 17 17ZD990-GX30K";
		
		String inputFilename = "resources/output/nouns/result_" + product + ".txt";
		String outputFilename = "resources/output/result_" + product + ".txt";
		mapCount(inputFilename, outputFilename, "UTF-8");
		//iterator 객체를 반환?
//		Iterator<String> i = map.keySet().iterator();
//		while(i.hasNext()) {
//			String key = i.next();
//			System.out.println(key + " : " + map.get(key));
//		}
		
	}	
	
	public static void mapCount(String inputFilename, String outputFilename,String encoding) throws IOException{		  
		 BufferedReader br;
		 BufferedWriter bw;	
		 HashMap<String,Integer>map_order = new HashMap<String,Integer>();
					
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilename), encoding));
				
				String line;
				//한줄씩 읽어와서 등록 혹은 count
				while ((line = br.readLine()) != null) {
					 if (map_order.containsKey(line)== false){
						 map_order.put(line, 1);
					 }
					 else
					 {
					 int k = map_order.get(line) +1;
					 map_order.replace(line, k);

					 }
				}
				br.close();
				br = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Map<String, Integer> lines = map_order;	
			Iterator i = sortByValue(lines).iterator();			
			try {
				  bw = new BufferedWriter(
		                 (new OutputStreamWriter(new FileOutputStream(outputFilename))));
				  
				  while(i.hasNext()) {
					  String key = (String)i.next();
					  bw.write(key + " : " + lines.get(key));
					  bw.newLine();
				  }
//				  for(String key : result){
//						 
//			            Integer value = lines.get(key);		 
//			            bw.write(key+" : "+value);
//			            bw.newLine();	 
//					}
				bw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("완료");
		}
		
	   public static List sortByValue(final Map map) {
		      java.util.List<String> list = new ArrayList();
		      list.addAll(((HashMap<String, Integer>) map).keySet());
		      
		      Collections.sort(list, new Comparator() {
		         public int compare(Object o1, Object o2) {
		            Object v1 = map.get(o1);
		            Object v2 = ((HashMap<String, Integer>) map).get(o2);
		            return ((Comparable) v2).compareTo(v1);
		         }

		      });
		      return list;
		   }
}
	
