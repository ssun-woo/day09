package object;

import java.util.ArrayList;
import members.Member;

/*
 
 절차지향
  - c 언어는 절차지향 언어라고 표현한다
  - 기능들로만 이루어져 있다
  - 함수들의 집합으로 만들어진 프로그램
 
  객체지향
   - c++, java, python... 등의 언어
   - 클래스라는 자료형으로 만들어진 것
   - 재활용이 용이하다
   - 절차지향보다 처리속도는 느리다
   - 객체는 변수다. '클래스'라는 '자료형으로 만들어진 객체'라고 표현한다
   
  클래스 
   - 사용자 정의 자료형
   - 변수와 기능들의 집합을 말한다
   - 재활용하기 편해서 만들어 사용한다
 */

//class Test01 {
//	public int age;
//	public String name, addr, phNum;
//}

public class Ex01 {

	public static void main(String[] args) {

		// ArrayList<String> a;
		// String s;
		// .을 찍으면 그안에 사용가능한 모든 기능을 볼 수 있고 사용할 수 있다
		// 전부다 불러오기 때문에 무겁고 느림

		Member m = new Member();
		m.name = "홍길동";
		m.addr = "산골짜기";

		System.out.println("이름 : " + m.name);
		System.out.println("주소 : " + m.addr);
	}

}
