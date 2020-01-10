package kr.co.shineware.nlp.komoran.test;

public class test {

	public static void main(String[] args) {
		
		String searchItem = "LGGRAM";
		String[] lg = {"LG", "엘지"}; String[] lg_s = {"GRAM", "그램",  "울트라PC", "울트라기어", "2IN1"};
		for(String i : lg) {
			if(searchItem.contains(i)) {
				System.out.println(i);
				searchItem = searchItem.replace(i, "%LG%");
				for(String s : lg_s) {
					if(searchItem.contains(s)) {
						searchItem.replace(s, "%"+s+"%");
					}
				}
			}
		}
		System.out.println(searchItem);
	}

}
