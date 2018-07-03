public class Question_004 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int largestPalindromeProduct = -1;

		for (int i = 1; i < 1_000; i++) {
			for (int j = 1; j < 1_000; j++) {
				int product = i * j;

				if (isPalindrome(product) && product > largestPalindromeProduct) {
					largestPalindromeProduct = product;
				}
			}
		}

		System.out.println(largestPalindromeProduct);
	}

	static boolean isPalindrome(int number) {
		String numberStr = String.valueOf(number);
		return numberStr.equals(new StringBuilder(numberStr).reverse().toString());
	}
}