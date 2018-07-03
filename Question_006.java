public class Question_006 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int sum = 0, sumOfSquares = 0, squaredSum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
			sumOfSquares += Math.pow(i, 2);
		}

		squaredSum = (int) Math.pow(sum, 2);

		System.out.println(Math.abs(sumOfSquares - squaredSum));
	}
}