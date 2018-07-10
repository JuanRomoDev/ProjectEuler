import java.math.BigInteger;

public class Question_048 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		BigInteger num = BigInteger.ZERO;

		for (int i = 1; i <= 1_000; i++) {
			num = num.add(BigInteger.valueOf(i).pow(i));
		}

		String numStr = num.toString();
		System.out.println(numStr.substring(numStr.length() - 10));
	}
}