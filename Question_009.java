public class Question_009 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {

		outer:
		for (int a = 1; a <= 332; a++) {
			for (int b = a + 1; a + b <= 665; b++) {
				int c = 1_000 - a - b;

				if ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) == (int) Math.pow(c, 2)) {
					System.out.println(a * b * c);
					break outer;
				}
			}
		}
	}
}