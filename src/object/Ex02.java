package object;

/*
 접근 제한자
 public : 클래스 외부 또는 내부에서 접근 가능하다
 private : 클래스 내부에서만 접근 가능하다
 */


public class Ex02 {
	public static void main(String[] args) {
		
		Test02 t = new Test02();
		t.name = "홍길동";
		t.age = 100;
		// age, name 두가지 변수가 있기 때문에 =100 같은 값을 넣으면 어디에 들어갈 지 모름 >> 오류
		// '.'을 사용해서 각각의 변수에 접근해야함
		
		// t.num = 100;
		// 접근 제한자가 private라서 다른 class파일에서 접근 불가능
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
