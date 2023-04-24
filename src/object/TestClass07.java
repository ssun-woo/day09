package object;

public class TestClass07 {

	// 정보은닉
	private void test() {
	}
	// private로 만들면 외부에서 접근을 허용하지 않는다

	public void test1(int num) {
		if (num == 1) {
			System.out.println(111);
			return;
			// return을 만나는 순간 메소드를 종료함
		}
		System.out.println("다음 문장 실행");
	}

	public int test2(int n) {
		if (n == 1) {
			System.out.println("test2 111");
			return 100;
		} else if (n == 2) {
			System.out.println("test2 222");
			return 200;
		} else {
			System.out.println("다음 문장 실행");
			return 0;
			// void를 return 하지 않을 경우 반드시 return을 만나야함
		}
	}

	public boolean test3() {
		return true;
	}

	public int test4() {
		int num = 1;
		if (num == 1) {
			return num;
		}
		return 0;
	}
	
	public String test5() {
		int num = 1;
		if (num == 1) {
			return "aaa";
		}
		return null;
	}
	
	// 변수명의 초기값을 지정할때 처럼 소문자로 시작 >> 0
	//                        대문자로 시작 >> null
	
	

}




















