import java.math.BigInteger;
import java.util.Map;
import java.util.HashMap;

public class Question_025 {

	static final BigInteger F1 = BigInteger.ONE;
	static final BigInteger F2 = BigInteger.ONE;

	static Map<Integer, BigInteger> cachedFibonacci = new HashMap<>();
	static {
		cachedFibonacci.put(1, F1);
		cachedFibonacci.put(2, F2);
	}

	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int desiredFiboIndex;

		for (int i = 1; ; i++) {
			BigInteger calculatedFibo = fibonacci(i);

			if (calculatedFibo.toString().length() == 1_000) {
				desiredFiboIndex = i;
				break;
			}
		}

		System.out.println(desiredFiboIndex);
	}

	static BigInteger fibonacci(int n) {
		BigInteger cachedFibo = cachedFibonacci.get(n);

		if (cachedFibo != null) {
			return cachedFibo;
		} else {
			BigInteger calculatedFibo = fibonacci(n - 1).add(fibonacci(n - 2));
			cachedFibonacci.put(n, calculatedFibo);

			return calculatedFibo;
		}
	}
}