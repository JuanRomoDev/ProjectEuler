public class QuestionOne {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % 3 ==0 || i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}