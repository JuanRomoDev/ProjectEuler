public class Question_012 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {

		int triangularNumber = 0;
		for (int i = 1; ; i++) {
			triangularNumber += i;

			int divisorCount = 0;
			for (int j = 1; j <= (int) Math.sqrt(triangularNumber); j++) {
				if (triangularNumber % j == 0) {
					divisorCount += 2;
				}
			}

			if (divisorCount > 500) {
				break;
			}
		}
		System.out.println(triangularNumber);
	}
}