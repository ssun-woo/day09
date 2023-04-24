package object;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {

		TestClass08 t = new TestClass08();

		String[] list = t.nameInput1();
		System.out.println("==============");
		System.out.println("배열로 출력");
		t.print1(list);
		System.out.println("==============");
		
		ArrayList<String> arr = new ArrayList<>();
		arr = t.nameInput2();
		System.out.println("==============");
		System.out.println("ArrayList로 출력");
		t.print2(arr);
		System.out.println("==============");
		
		HashMap<Integer, String> map = new HashMap<>();
		map = t.nameInput3();
		System.out.println("==============");
		System.out.println("HashMap으로 출력");
		t.print3(map);
		System.out.println("==============");
				
		System.out.println("홀짝 구분");
		int num = t.inputNum();
		boolean bool = t.oddNum(num);
		t.printOddNum(bool);
		
		System.out.println("3의 배수 구분");
		int n1 = t.inputNum2();
		int n2 = t.three(n1);
		t.printThree(n2);

		System.out.println("소수인지 아닌지 판별");
		int num1 = t.inputNum3();
		boolean bool2 = t.checkPrimeNumber(num1);
		t.printPrimeNumber2(bool2);

		System.out.println("절대값을 구하는 메소드");
		int number = t.inputNum();
		int number2 = t.absoluteValue(number);
		t.printAbsoluteValue(number, number2);

	}
}
