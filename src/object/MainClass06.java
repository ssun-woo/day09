package object;

public class MainClass06 {

	public static void main(String[] args) {

		TestClass06 t = new TestClass06();
		// System.out.println(t);
		// 새로운 객체를 만들면 그 객체를 참조한다
		// 출력하면 't'의 주소가 출력됨
		
		int[] num = t.myInput();
		// int[] 타입으로 값이 넘어옴
		
		int s = t.test(num[0], num[1], num);
		// 각각의 값을 다음 메소드에 대입
		
		
		t.print(num, s);
		// num배열을 받고, s로 sum을 받아옴
		
		
		
		
		
		
		
		
	} 
}















