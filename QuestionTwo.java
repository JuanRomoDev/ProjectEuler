public class QuestionTwo {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		long sum = 0;

		int F1 = 1;
		int F2 = 2;

		int secondLastFibo = F1;
		int lastFibo = F2;

		int result;
		
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

			if (result > 4_000_000) {
				break;
			}

			if (result % 2 == 0) {
				sum += result;
			}
		}

		System.out.println(sum);
	}
}