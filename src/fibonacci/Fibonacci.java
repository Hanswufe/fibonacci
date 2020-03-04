package fibonacci;

public class Fibonacci {
	//参数从1开始的斐波那契数列
	public static int of(int n) {
		if (n == 1) {
			return 1;
		}
		int pre_first = 0;
		int pre_second = 1;
		int fib = 0;
		for (int i = 2; i <= n; i++) {
			fib = pre_first + pre_second;
			pre_first = pre_second;
			pre_second = fib;
		}
		return fib;
	}

}
