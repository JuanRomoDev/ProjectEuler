public class Question_002 {

	static final int F1 = 1;
	static final int F2 = 2;

	static final int LIMIT = 4_000_000;

	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		long sum = 0;

		int secondLastFibo = F1;
		int lastFibo = F2;

		int result;
		
		// Calculate Fibonacci numbers iteratively.
		for (int i = 1; ; i++) {
			switch (i) {
				case 1:
					result = F1;
					break;

				case 2:
					result = F2;
					break;

				default:
					result = secondLastFibo + lastFibo;

					secondLastFibo = lastFibo;
					lastFibo = result;
			}

			if (result > LIMIT) {
				break;
			}

			if (result % 2 == 0) {
				sum += result;
			}
		}

		System.out.println(sum);
	}
}