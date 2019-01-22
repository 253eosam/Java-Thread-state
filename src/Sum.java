// Java는 전역변수 없음.
// thread들은 공유객체를 parameter로 전달해야 함.
public class Sum {
	private int sum;
	public int get() {
		return sum;
	}
	public void set(int s) {
		sum = s;
	}
}
