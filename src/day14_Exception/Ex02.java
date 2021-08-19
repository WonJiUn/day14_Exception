package day14_Exception;

class BBB{
	public int aaa;
}

class AAA extends BBB{
	/*
	public void catch1(int a) {
		System.out.println("정수 : " + a);
	}
	public void catch1(String a) {
		System.out.println("문자열 : " + a);
	}
	*/
	public void catch1(Object a) {
		System.out.println("오브젝트 : " + a);
	}//오브젝트 하나로 받아주는것도 가능
}

public class Ex02 {
	public static void main(String[] args) {
		
		AAA a = new AAA();		//AAA(자식)의 정보를 BBB(부모)에 저장 가능
		Object b = new AAA();	//모든 클래스는 오브젝트를 상속받으며 태어나기 때문에 오브젝트에도 가능
		
		Object ss = "test";
		a.catch1(11);
		a.catch1("aaaa");
		a.catch1(1.111);
		a.catch1('a');
		
		
	}
}
