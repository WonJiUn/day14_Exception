package day14_Exception;

import java.io.IOException;

class A{
	public void test() throws IOException {

		ProcessBuilder b = new ProcessBuilder("calc");
		b.start();
	}
	public void display() throws IOException {
		test();
	}
}

public class Ex04 {
	public static void main(String[] args) throws IOException {
		
		A a = new A();
		a.display();
		
		//throws IOException : 예외 사항 발생시 프로그램 종료
		//try : 예외 사항이 발생해도 프로그램 종료되지 않게할수 있음
		
		//예외 전가를 한번 쓰게되면 해당 메소드를 가져다 쓰는 모든곳에 넣어야함
		
		System.out.println("다음 문장들 실행");
		
		
		
	}
}
