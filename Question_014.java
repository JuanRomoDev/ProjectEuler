import java.util.Map;
import java.util.HashMap;

public class Question_014 {

	static Map<Long, Integer> cachedChainCount = new HashMap<>();

	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int startingNumber = -1;
		int maxChainCount = -1;

		for (int i = 1; i < 1_000_000; i++) {

			int chainCount = calculateCollatz(i);
			
			if (chainCount > maxChainCount) {
				maxChainCount = chainCount;
				startingNumber = i;
			}
		}

		System.out.println(startingNumber);
	}

	static int calculateCollatz(long n) {
		Integer chainCount = cachedChainCount.get(n);
		
		if (chainCount != null) {
			return chainCount;
		}

		if (n == 1) {
			return 1;
		} else if (n % 2 == 0) {
			chainCount = 1 + calculateCollatz(n / 2);
		} else {
			chainCount =  2 + calculateCollatz((3 * n + 1) / 2);
		}

		cachedChainCount.put(n, chainCount);
		return chainCount;
	}
}