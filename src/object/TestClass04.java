package object;

import java.util.Scanner;

public class TestClass04 {
	// argument : 메소드에서 받아주는 값
	// 			  매개변수
	//    		  아래의 경우 int num
	public void sumFunc(int num) { // 100 이라는 값이 넘어옴 받기위해서는 ()안에 입력
								   // 넘어오는 변수형에 맞춰서 입력
								   // 변수명까지 일치할 필요는 없음
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + "까지의 합 : " + sum);
	}

}
