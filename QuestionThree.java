public class QuestionThree {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		long number = 600_851_475_143L;

		int largestPrimeFactor = -1;

		outer:
		// Iterate through all potential factors.
		for (int i = 2; i < (int) Math.sqrt(number); i++) {
			// Verify that the iteration variable is a factor.
			if (number % i != 0) {
				continue;
			}

			// Verify that the iteration variable is prime.
			for (int j = 2; j < (int) Math.sqrt(i); j++) {
				// If the iteration variable is not prime move to the next number.
				if (i % j == 0) {
					continue outer;
				}
			}

			// Update largest prime factor.
			largestPrimeFactor = i;
		}

		System.out.print(largestPrimeFactor);
	}
}