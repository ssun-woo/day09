package object;

import java.util.ArrayList;

public class MainClass07 {
	
	public static void main(String[] args) {
		
		TestClass07 t = new TestClass07();
		
		// t.test();
		// private로 만들어진 메소드라 접근을 허용하지 않음
		// 정보은닉
		
		
		t.test1(1);
		int n = t.test2(1);
		int n2 = t.test2(2);
		
		ArrayList<String> arr = new ArrayList<>();
		
		boolean bo = arr.add("aaa");
		
		boolean bool = t.test3();
		// 반환하는 타입과 선언하는 변수형의 타입이 같아야 오류가 발생하지 않는다
		
		
		
		
		
		
		
	}
}
