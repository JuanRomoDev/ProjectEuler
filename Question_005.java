public class Question_005 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int smallestMultiple = -1;

		outer:
		// Increment the iteration variable by the largest divisor that smallest multiple is required to have.
		for (int i = 20; ; i += 20) {
			
			// Iterate and test all required divisors that the iteration variable is required to have.
			for (int j = 2; j <= 20; j++) {
				// Move to the next number if the iteration variable is not divisible by all required divisors.
				if (i % j != 0) {
					continue outer;
				}
			}

			// Smallest multiple has been found.
			smallestMultiple = i;

			break;
		}

		System.out.println(smallestMultiple);
	}
}