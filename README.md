# Java-Thread-state
using Runnable interface 

자바에서 스레드를 생성하는 두가지 방법
- Thread class 상속
- Runnable interface 구현 => get using.

* ThreadObj.start() -> 메모리 할당 + run() 호출 -> runnable 상태가 됨
// 자바는 eligible to run 상태와 running 상태를 구별하지 
