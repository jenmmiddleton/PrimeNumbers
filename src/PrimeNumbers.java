import java.util.ArrayList;

public class PrimeNumbers {

    private int[] getAllPrimes(int max) {

        int[] primes = new int[100];
        primes[0] = 2;
        int primesIndex = 1;

        for (int i = 3; i <= max; i++) {
            if (isPrime(primes, primesIndex, i)) {
                primes[primesIndex++] = i;
            }
        }

        return primes;
    }

    private boolean isPrime(int[] primes, int primesIndex, int valueToCheck) {

        for (int i = 0; i < primesIndex; i++) {
            if (valueToCheck % primes[i] == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main (String args[]) {

        PrimeNumbers primeNumbers = new PrimeNumbers();

        int primesThroughMax = 100;

        int primes[] = primeNumbers.getAllPrimes(primesThroughMax);

        int i = 0;
        while ((primes[i] != 0) && (i < primes.length)) {
            System.out.println("Prime #" + (i + 1) + ": " + primes[i]);
            i++;
        }
    }
}
