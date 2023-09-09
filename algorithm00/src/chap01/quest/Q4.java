package chap01.quest;

import java.util.Scanner;

class Q4 {
	static int med (int a, int b, int c) {
		if(a>=b) {
			if(a>b) {
				if (b>=c) {
					return b;
				} else if(a>=c) {
					return c;
				} else {
					return a;
				}
			} else if (b>=c) {
				return b;
			} else {
				return b;
			}
		} else if(a>=c) {
				return a;
		} else if (b>=c) {
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a: "); int a = sc.nextInt();
		System.out.print("b: "); int b = sc.nextInt();
		System.out.print("c: "); int c = sc.nextInt();
		
		System.out.println("중앙값: " + med(a, b, c));
	}
}
