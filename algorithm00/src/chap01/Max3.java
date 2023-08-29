package chap01;

import java.util.Scanner;	// util 패키지에 있는 Scanner 클래스를 프로그램에 포함

class Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//System.in: 키보드와 연결된 표준 입련 스트림(standard input);
		
		System.out.println("세 정수의 최댓값");
		System.out.print("a: "); int a = sc.nextInt();
		System.out.print("b: "); int b = sc.nextInt();
		System.out.print("c: "); int c = sc.nextInt();
		// keyboard(System.in) -> sc -nextInt()-> a/b/c
		
		// 순차적(concatenation)구조
		int max = a;
		if (b > max) max = b; // => 선택(selection) 구조
		if (c > max) max = c;
		
		System.out.println("최댓값: " + max);
	}
}
