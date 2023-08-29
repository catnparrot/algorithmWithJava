package chap01.quest;

class Q2 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (b<min) min = b;
		if (c<min) min = c;
		return min;
	}
}
