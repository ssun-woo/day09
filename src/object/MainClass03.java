package object;

import java.util.Scanner;

/*
 method
  - 함수와 메소드는 비슷하다
  - 어떠한 기능을 가지고 있다면 함수 또는 메소드라고 표현한다
  - 소괄호가 있으면 대부분 기능이라고 보면 된다
  - 함수는 절차지향언어에서 표현하는 방식이며 메소드는 객체지향 표현
 */


public class MainClass03 {
	
	public static void main(String[] args) {
		
		// 메소드가 동작이 되는지 확인하기 위해 main에서 먼저 실행
		
//		Scanner scan = new Scanner(System.in);
//		int num = 0, sum=0;
//		
//		System.out.print("수 입력 : ");
//		num = scan.nextInt();
//		for(int i=0; i<=num; i++) {
//			sum += i;
//		}
//		System.out.println("1~" + num + "까지의 합 : " + sum);
		
		
		// System.out.println();
		// println() 출력도 메소드를 호출하는것
		
		System.out.println("main start");
		TestClass03 t = new TestClass03(); // 객체화
		t.sumFunc();	// test start, test finish
		System.out.println("main finish");
		
		
		// 디버그를 확인하기위해 알고있는 기능은 F5로 넘기고
		// 그 안을 확인하고싶으면 F6을 눌러 기능들 확인
		
	}
}
