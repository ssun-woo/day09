package object;

import java.util.Scanner;

public class TestClass03 {

	public void sumFunc() {
//  접근제한자/반환값/메소드이름(처음에는 소문자, 합성어의 첫번째는 대문자)
		
		System.out.println("test start");
		Scanner scan = new Scanner(System.in);
		int num = 0, sum=0;
		
		System.out.print("수 입력 : ");
		num = scan.nextInt();
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + "까지의 합 : " + sum);
		// MainClass03에서 정상적으로 작동하던 코드를 이쪽으로 옮겨옴
		
		System.out.println("test finish");
		
		// 지금 방법은 강한결합, 이렇게는 보통 사용 안함
		// 재활용하기 불편하기 때문에
	}
}
