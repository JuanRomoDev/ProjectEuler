import java.util.ArrayList;
import java.util.List;

public class Question_050 {

    private static final int LIMIT = 1_000_000;
    private static final int FIRST_PRIME_NUMBER = 2;

    private static List<Integer> cachedPrimes = new ArrayList<>();

    public static void main(String[] args) {
        solutionOne();
    }

    private static void solutionOne() {
        int primeNumber = FIRST_PRIME_NUMBER;
        int largestConsecutivePrimeCount = 1;

        for (int i = FIRST_PRIME_NUMBER; i < LIMIT; i++) {

            if (isPrimeNumber(i)) {
                cachedPrimes.add(i);

                for (int j = 0; j < cachedPrimes.size(); j++) {

                    if (cachedPrimes.get(j) > i) {
                        break;
                    }

                    int consecutivePrimeCount = 0;

                    int sum = 0;
                    for (int k : cachedPrimes.subList(j, cachedPrimes.size())) {
                        sum += k;
                        consecutivePrimeCount++;

                        if (sum == i) {
                            if (consecutivePrimeCount > largestConsecutivePrimeCount) {
                                largestConsecutivePrimeCount = consecutivePrimeCount;
                                primeNumber = i;
                            }
                        } else if (sum > i) {
                            break;
                        }
                    }

                }
            }
        }

        System.out.println(primeNumber);
    }

    private static boolean isPrimeNumber(int number) {
        if (number < FIRST_PRIME_NUMBER) {
            return false;
        }

        for (int i = FIRST_PRIME_NUMBER; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}