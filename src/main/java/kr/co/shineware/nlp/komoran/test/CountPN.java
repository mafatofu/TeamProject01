package kr.co.shineware.nlp.komoran.test;

import java.util.HashMap;
import java.util.List;
//긍정/부정 단어의 갯수를 셈 
public class CountPN {
	KeyWordList klist = new KeyWordList();
	List<String> plist;
	List<String> nlist;
	public HashMap<String, Integer> phashmap = new HashMap<String, Integer>();
	public HashMap<String, Integer> nhashmap = new HashMap<String, Integer>();
	String keyword;
	
	public CountPN(String keyword) {
		super();
		this.keyword = keyword;
		plist = klist.positiveList(keyword);	
		nlist = klist.negativeList(keyword);
		
		for(int i=0;i<plist.size();i++) {
			phashmap.put(plist.get(i), 0);
		} 
		for(int i=0;i<nlist.size();i++) {
            nhashmap.put(nlist.get(i), 0);
        }
	}	

}
