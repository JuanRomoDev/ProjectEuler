import java.io.*;

public class Question_011 {
	public static void main(String[] args) {
		solutionOne();
	}

	static void solutionOne() {
		int rows = 20, columns = 20;

		int[][] numberGrid = new int[rows][columns];

		// Extract numbers from file.
		try(BufferedReader br = new BufferedReader(new FileReader("Question_011_file.txt"))) {

			for (int i = 0; i < rows; i++) {
				String line = br.readLine();

				if (line == null) {
					break;
				}

				String[] numbers = line.split(" ");

				for (int j = 0; j < columns; j++) {
					numberGrid[i][j] = Integer.valueOf(numbers[j]);
				}
			}
		} catch (Exception e) {

		}

		int greatestProduct = -1;
		int count = 0;

		// down
		for (int i = 0; i + 3 < rows; i++) {
			for (int j = 0; j < columns; j++) {

				int product = numberGrid[i][j] * numberGrid[i + 1][j] * 
					numberGrid[i + 2][j] * numberGrid[i + 3][j];

					count+= product;

				if (product > greatestProduct) {
					greatestProduct = product;
				}
			}
		}

		System.out.println(count);
		count = 0;

		// left to right
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j + 3 < columns; j++) {
				

				int product = numberGrid[i][j] * numberGrid[i][j + 1] * 
					numberGrid[i][j + 2] * numberGrid[i][j + 3];

count+= product;
				if (product > greatestProduct) {
					greatestProduct = product;
				}
			}
		}

		System.out.println(count);
		count = 0;

		// left to right down diagonal
		for (int i = 0; i + 3 < rows; i++) {
			for (int j = 0; j + 3 < columns; j++) {
				

				int product = numberGrid[i][j] * numberGrid[i + 1][j + 1] * 
					numberGrid[i + 2][j + 2] * numberGrid[i + 3][j + 3];
count+= product;
				if (product > greatestProduct) {
					greatestProduct = product;
				}
			
			}
		}

		System.out.println(count);
		count = 0;

		// left to right up diagonal
		for (int i = rows - 1; i - 3 >= 0; i--) {
			for (int j = 0; j + 3 < columns; j++) {
				

				int product = numberGrid[i][j] * numberGrid[i - 1][j + 1] * 
					numberGrid[i - 2][j + 2] * numberGrid[i - 3][j + 3];
count+= product;
				if (product > greatestProduct) {
					greatestProduct = product;
				}

			}
		}

		System.out.println(count);

		System.out.println(greatestProduct);
	}
}