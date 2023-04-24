package object;

import java.util.Scanner;

public class TestClass06 {

	public int[] myInput() {
		Scanner scan = new Scanner(System.in);
		int n1 = 0, n2 = 0, sum = 0;

		System.out.print("첫번째 수 입력 : ");
		n1 = scan.nextInt();

		System.out.print("두번째 수 입력 : ");
		n2 = scan.nextInt();
		
		int[] arr = {n1, n2};
		
		// return n1, n2;
		// 2개의 값을 돌려줄 수 없음
		return arr;
	}

	public int test(int n1, int n2, int[] num) {
		// int sum = num[0] + num[1];
		int sum = n1 + n2;
		// 위 아래 어떤걸로 해도 상관 없음
		
		return sum;
	}
	
	public void print(int[] num, int sum) {
		System.out.println(num[0] + " + " + num[1] + " = " + sum);
	}

}
