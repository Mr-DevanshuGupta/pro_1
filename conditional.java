import java.util.*;

class conditional {
	public static void main(String args[]) {
		int c = 60;
		// float ans = Sin(c);
		// System.out.println(ans);
		String as = new String("Hello World");
		int index = 7;
		String bs = char_at(as, index);
		System.out.print("The character at index" + index);
		System.out.print(" is " + bs);

	}

	static float Sin(int a) {
		float res = 4 * (a) * (180 - a);
		res /= (40500 - a * (180 - a));
		return res;
	}

	static String char_at(String ABC, int n) {
		return ABC.substring(n - 1, n);

	}
}
