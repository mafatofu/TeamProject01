package kr.co.shineware.nlp.komoran.test;
import java.io.*;
import java.util.*;
import java.io.FileWriter;

public class WordCount02 {

	public static void main(String[] args) throws IOException {
		String product = "1.LG전자 울트라PC 15U590-GA56K";
		String inputFilename = "resources/output/nouns/result_" + product + ".txt";
		String outputFilename = "resources/output/count/result_" + product + ".txt";
		File f = new File(inputFilename);
		FileReader fr;
		
		try {
			fr = new FileReader(f); //파일 읽기
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer st;
			HashMap<String,Integer>map_order = new HashMap<String,Integer>();
			Value02 bvc = new Value02(map_order);
			TreeMap<String,Integer>sorted_map = new TreeMap<String,Integer>(bvc);
			int cnt = 1;
			String str = "\\n";
			while((str = br.readLine()) != null) {
				st = new StringTokenizer(str);

				for(int i=1; i< st.countTokens();i++ ){
					String data = st.nextToken().replaceAll("[^a-zA-Z]",""); 
					if (map_order.containsKey(data)== false){ map_order.put(st.nextToken(), 1);}
					else
					{
						int k = map_order.get(data) +1;
						map_order.replace(data, k);

					}
				}

			}
			
			sorted_map.putAll(map_order);
			br.close();
			fr.close();
			FileWriter w = null;
			w = new FileWriter(outputFilename);
			Set<String> set =sorted_map.keySet();
			for(String item : set){
				cnt = map_order.get(item);
				w.write(item+" \t"+cnt);
				w.write("\r\n");
			}

			w.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}

