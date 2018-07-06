import java.io.*;

public class Question_008 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		String number = "";

		// Extract number from file.
		try(BufferedReader br = new BufferedReader(new FileReader("Question_008_file.txt"))) {
			String line = br.readLine();

			while (line != null) {
				number += line;
				line = br.readLine();
			}
		} catch (Exception e) {

		}

		long greatestProduct = -1;

		// Iterate through number in blocks of 13.
		for (int i = 0; i + 12 < number.length(); i++) {
			long product = 1;

			// Calculate the product of 13 adjacent digits.
			for (int j = i; j <= i + 12; j++) {
				product *= Character.getNumericValue(number.charAt(j));
			}

			if (product > greatestProduct) {
				greatestProduct = product;
			}
		}

		System.out.println(greatestProduct);
	}
}