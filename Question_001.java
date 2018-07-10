public class Question_001 {

	static final int LIMIT = 1_000;

	public static void main(String[] args) {
		solutionOne();
		solutionTwo();
	}

	static void solutionOne() {
		int sum = 0;

		// Add numbers divisible by 3 or 5.
		for (int i = 0; i < LIMIT; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

	static void solutionTwo() {
		int sum = 0;

		// Add numbers divisible by 3.
		for (int i = 0; i < LIMIT; i += 3) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		// Add numbers divisible of 5.
		for (int i = 0; i < LIMIT; i += 5) {
			if (i % 5 == 0) {
				sum += i;
			}
		}

		// Remove overlapping divisors shared by 3 and 5.
		for (int i = 0; i < LIMIT; i += 15) {
			if (i % 15 == 0) {
				sum -= i;
			}
		}

		System.out.println(sum);
	}
}