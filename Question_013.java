import java.io.*;
import java.math.BigInteger;

public class Question_013 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		BigInteger sum = BigInteger.ZERO;

		// Extract numbers from file.
		try(BufferedReader br = new BufferedReader(new FileReader("Question_013_file.txt"))) {
			String line = br.readLine();

			while (line != null) {
				sum = sum.add(new BigInteger(line));
				line = br.readLine();
			}
		} catch (Exception e) {

		}

		System.out.println(sum.toString().substring(0, 10));
	}
}