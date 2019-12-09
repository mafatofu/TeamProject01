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
	
	@Override
	public String toString() {
		return getKeyword() + " ? " + getPositive() + " : " + getNegative();
	}

}
