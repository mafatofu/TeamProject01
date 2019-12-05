package kr.co.shineware.nlp.komoran.test;

import java.util.Comparator;
import java.util.Map;

class Value02 implements Comparator {

	Map<String, Integer> base;
	public Value02(Map<String, Integer> base) {
		this.base = base;
	}

	@Override
	public int compare(Object a, Object b) {
		if (base.get(a) >= base.get(b)) {
			return -1;
		} else {
			return 1;
		} 
	}
}