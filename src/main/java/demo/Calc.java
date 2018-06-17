package demo;

public class Calc {
	public int add(int i, int j) {
		return i+j;
	}
	public int divide(String no1, String no2) {
		int i = Integer.parseInt(no1);
		int j = Integer.parseInt(no2);
		return i/j;
	}
}