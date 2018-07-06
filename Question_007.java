public class Question_007 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int primeCount = 0;

		for (int i = 2; ; i++) {
			if (isPrime(i) && ++primeCount == 10_001) {
				System.out.println(i);
				break;
			}
		}
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