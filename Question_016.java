import java.math.BigInteger;

public class Question_016 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		BigInteger num = new BigInteger("2").pow(1000);
		String numStr = num.toString();

		int sum = 0;
		for (char digit : numStr.toCharArray()) {
			sum += Character.getNumericValue(digit);
		}
		System.out.println(sum);
	}
}