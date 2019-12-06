package kr.co.shineware.nlp.komoran.test;

import java.io.*;
import java.util.*;

public class testsetse {
	public static void mapCount(String inputFilename, String outputFilename, String encoding) throws IOException{        
	      BufferedReader br;
	      BufferedWriter bw;
	  
	      HashMap<String,Integer>map_order = new HashMap<String,Integer>();
	  
	      try {
	         br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilename), encoding));
	         
	         //int cnt = 1;
	         String line;
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
	      Iterator it = sortByValue(lines).iterator();
	    
	     try {
	          bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilename)));
	         while(it.hasNext()) {
	            String temp = (String) it.next();
	            bw.write(temp + " = " + lines.get(temp));
	            bw.newLine();
	            //System.out.println(temp + " = " + lines.get(temp));
	         }
	         bw.close();
	        } 
	     catch (FileNotFoundException e) {
	         e.printStackTrace();
	        }
	   }
	   /*추가 메서드*/
	   
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
