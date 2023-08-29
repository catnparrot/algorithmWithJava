package chap01;

class Max3m {
	static int max3(int a, int b, int c) {
		int max = a;
		if (b>max) max=b;
		if (c>max) max=c;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(,,):" + max3(3, 2, 1));
		System.out.println("max3(3, 2, 2):" + max3(3, 2, 2));
		System.out.println("max3(3, 1, 2):" + max3(3, 1, 2));
		System.out.println("max3(3, 2, 3):" + max3(3, 2, 3));
		System.out.println("max3(2, 1, 3):" + max3(2, 1, 3));
		System.out.println("max3(3, 3, 2):" + max3(3, 3, 2));
		System.out.println("max3(3, 3, 3):" + max3(3, 3, 3));
		System.out.println("max3(2, 2, 3):" + max3(2, 2, 3));
		System.out.println("max3(2, 3, 1):" + max3(2, 3, 1));
		System.out.println("max3(2, 3, 2):" + max3(2, 3, 2));
		System.out.println("max3(1, 3, 2):" + max3(1, 3, 2));
		System.out.println("max3(2, 3, 3):" + max3(2, 3, 3));
		System.out.println("max3(1, 2, 3):" + max3(1, 2, 3));
	}
}

// 매개변수(parameter) or 형식매개변수(formal parameter)
/* 메서드를 정의할 때 메서드에 전달되는 값을 저장하기 위해 선언하는 변수(var).
 * 형식매개변수를 가인수(임시인수)라 하고 메서드 호출 시 사용하는 매개변수의 값을 실인수(actual argument)
 * [simple]: 메서드 정의 시 - 매개변수 / 메서드 호출 시 - 실인수  */

// 알고리즘
/* 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이뤄진 집합. */
