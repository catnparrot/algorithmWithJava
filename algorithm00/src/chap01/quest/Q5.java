package chap01.quest;

public class Q5 {
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
	
	static String answer () {
		String a = "  처음 if 문의 판단\r\n"
				+ "　　  if ((b >= a && c<= a) || (b <= a && c >= a)\r\n"
				+ " 에 주목합니다. \r\n"
				+ "  여기서 b >= a 및 b <= a의 판단을 뒤집은 판단\r\n"
				+ "  (실질적으로 동일한 판단)이, 계속하여  else 이후에서\r\n"
				+ "　　 else if ((a > b && c < b) || (b <= a && c > b)\r\n"
				+ "  로 수행됩니다. 즉, 처음 if가 성립하지 않는 경우에도\r\n"
				+ "  2번째 if에서 (실질적으로) 같은 판단을 수행하므로,\r\n"
				+ "  효율이 나빠집니다.";
		return a;
	}
	
	public static void main(String[] args) {
		String a = answer();
		System.out.println(a);
	}
}
