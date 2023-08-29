package chap01.quest;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println(Q1.max4(a, b, c, d));
		System.out.println(Q2.min3(a, b, c));
		System.out.println(Q3.min4(a, b, c, d));
	}
}
