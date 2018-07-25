import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class Problem_022 {
    public static void main(String[] args) {
        solveProblem();
    }

    private static void solveProblem() {

        String[] names;
        try(BufferedReader br = new BufferedReader(new FileReader("Problem_022_file.txt"))) {
            String line = br.readLine();
            names = line.split(",");
        } catch (Exception e) {
            System.out.println(e);
            return;
        }

        Arrays.sort(names);

        int nameScoreSum = 0;
        for (int i = 0; i < names.length; i++) {
            int nameWorth = 0;
            for (char letter : names[i].toCharArray()) {
                if (Character.isAlphabetic(letter)) {
                    nameWorth += letter - 64;
                }
            }
            nameScoreSum += nameWorth * (i + 1);
        }
        
        System.out.println(nameScoreSum);
    }
}