package object;

import java.util.Scanner;

public class MainClass04 {
	
	public static void main(String[] args) {
		
		System.out.println("main start");
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("수 입력 : ");
		num = scan.nextInt();
		
		TestClass04 t = new TestClass04();
		// parameter : 메소드에 넘겨주는 값
		// 			   (인자값)
		
		t.sumFunc(num);
		
		
		System.out.println("main finish");
		
		
	}
}
