
public class Summation implements Runnable {
	//스레드 간 공유 객체 및 변수
	private Sum sum;
	private int upper;
	
	public Summation(int upper, Sum sum) {
		this.upper = upper;
		this.sum = sum;
	}
	
	//thread's main()
	public void run() {
		int s = 0;
		for(int i = 0 ; i <= upper ; i++) {
			s += i;
		}
		sum.set(s);
	}

}
