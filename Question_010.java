public class Question_010 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		long sum = 0;

		for (int i = 2; i < 2_000_000; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

	static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= (int) Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}