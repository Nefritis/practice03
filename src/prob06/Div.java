package prob06;

public class Div {
	private int a;
	private int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}

	public int calculate() {
		if(b==0){
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		int result;
		result = this.a/this.b;
		return result;
	}
}
