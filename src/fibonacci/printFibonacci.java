package fibonacci;

public class printFibonacci {
	public static void main(String[] args) {

		// 循环打印1~200的Fibonacci数列
		for (int i = 1; i <= 200; i++) {			
			System.out.print(Fibonacci.of(i) + ",");
		}
	}

}
