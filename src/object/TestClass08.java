package object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class TestClass08 {
	Scanner scan = new Scanner(System.in);
	/*
	 * - 모든 문제는 main, 연산, 입력, 출력하는 기능으로 만드세요 - 만약 연산하는 기능이 없으면 연산기능은 뺴도됩니다 1. 3개의
	 * 이름을 입력받아 출력(배열, ArrayList, HashMap) 2. 입력 값이 짝/홀 구분 3. 입력 값이 3의 배수/ 아닌지 구분 4.
	 * 입력 값이 소수인지 아닌지 판별 5. 절대값을 구하는 메소드
	 */

	// 1. 3개의 이름을 입력받아 출력(배열, ArrayList, HashMap)
	public String[] nameInput1() {

		String n1, n2, n3;

		System.out.print("첫번째 이름을 입력하세요 : ");
		n1 = scan.next();
		System.out.print("두번째 이름을 입력하세요 : ");
		n2 = scan.next();
		System.out.print("세번째 이름을 입력하세요 : ");
		n3 = scan.next();

		String[] list = { n1, n2, n3 };
		return list;
	}

	public void print1(String[] list) {
		for (String s : list) {
			System.out.println(s);
		}
	}

	public ArrayList<String> nameInput2() {

		ArrayList<String> arr = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		String n1, n2, n3;

		System.out.print("첫번째 이름을 입력하세요 : ");
		n1 = scan.next();
		System.out.print("두번째 이름을 입력하세요 : ");
		n2 = scan.next();
		System.out.print("세번째 이름을 입력하세요 : ");
		n3 = scan.next();

		arr.add(n1);
		arr.add(n2);
		arr.add(n3);

		return arr;
	}

	public void print2(ArrayList<String> arr) {
		System.out.println(arr);
	}

	public HashMap<Integer, String> nameInput3() {
		HashMap<Integer, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		String n1, n2, n3;

		System.out.print("첫번째 이름을 입력하세요 : ");
		n1 = scan.next();
		System.out.print("두번째 이름을 입력하세요 : ");
		n2 = scan.next();
		System.out.print("세번째 이름을 입력하세요 : ");
		n3 = scan.next();

		map.put(1, n1);
		map.put(2, n2);
		map.put(3, n3);

		return map;
	}

	public void print3(HashMap<Integer, String> map) {
		Collection<String> col = map.values();
		System.out.println(col);
	}

	// 2. 입력 값이 짝/홀 구분

	public int inputNum() {
		System.out.print("수 입력 : ");
		int num1 = scan.nextInt();
		return num1;
	}

	public boolean oddNum(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void printOddNum(boolean bool) {
		if (bool) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

	// 입력 값이 3의 배수/ 아닌지 구분

	public int inputNum2() {
		System.out.print("수 입력 : ");
		int num = scan.nextInt();
		return num;
	}

	public int three(int num) {
		if (num % 3 == 0) {
			return 0;
		} else {
			return 1;
		}
	}

	public void printThree(int num) {
		if (num == 0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
	}

	public int inputNum3() {
		System.out.print("수 입력 : ");
		int num = scan.nextInt();
		return num;
	}

	public boolean checkPrimeNumber(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return true;
			}
		}
		return false;
	}

	public void printPrimeNumber2(boolean bool) {
		if (bool == true) {
			System.out.println("소수가 아닙니다");
		} else {
			System.out.println("소수입니다");
		}
	}

	public int absoluteValue(int num) {
		if (num < 0) {
			num = -num;
		}
		return num;
	}

	public void printAbsoluteValue(int num, int num2) {
		System.out.println(num + "의 절댓값 : " + num2);
	}

}
