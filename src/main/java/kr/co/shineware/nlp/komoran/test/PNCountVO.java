package kr.co.shineware.nlp.komoran.test;


public class PNCountVO {
	private String keyword;
	private int positive;
	private int negative;
	private int total;

	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPositive() {
		return positive;
	}
	public void setPositive(int positive) {
		this.positive = positive;
	}
	public int getNegative() {
		return negative;
	}
	public void setNegative(int negative) {
		this.negative = negative;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = negative + positive;
	}
	
	public String getKey() {
		switch (this.keyword) {
		case "shipping": return "배송";
		case "gift": return "사은품";
		case "price": return "가격";
		case "window": return "윈도우";
		case "cost": return "가성비";
		case "perform": return "성능";
		case "display": return "화면";
		case "weight": return "무게";
		case "speed": return "속도";
		default: return keyword;
		}
	}
	
	@Override
	public String toString() {
		return getKey() + " " + getPositive() + " : " + getNegative();
	}

}
