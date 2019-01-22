/*
 * Title : Sn을 계산하는 Thread 작성 (Runnable interface)
 * Date : 2019-01-22
 * Author : Donald D
 * Detail : 두 가지 스레드 생성 방법
 * - Thread 클래스를 상속 받아 작성
 * - Runnable 인터페이스 구현 ex) calls summation implements Runnable
 ** Runnable이란? CPU만 할당받으면 실행될 수 있는 상태
 * 
 */

//Usage : java Driver upperValue
public class Driver {
	
	//main Thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스레드 간 공유 객체 및 변수
		Sum sumObject = new Sum();
		int upper = Integer.parseInt(args[0]);
		
		//Summation 스레드 생성 및 실행
		Thread child = new Thread(new Summation(upper, sumObject));
		child.start();
		// Summation 스레드 종료를 기다림. 공유객체로부터 값 획득.
		try {
			child.join();
			System.out.println("총합: " + sumObject.get());
		}catch(InterruptedException e) {
			
		}
		
		
	}

}
