package homework1;

public class MultiThreadSolution {
    public static void main(String[] args) {
        long count = 0;
        try {
            count = countNumbersTwoThreads();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Rezultat v dvuh potokah : " + count);
    }

    public static long countNumbersTwoThreads() throws InterruptedException {
        long[] result = new long[2];

        Thread thread1 = new Thread(() -> result[0] = countNumbersInRange(1, 1_000_000_000));
        Thread thread2 = new Thread(() -> result[1] = countNumbersInRange(1_000_000_001, 2_000_000_000));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        return result[0] + result[1];
    }

    public static long countNumbersInRange(int start, int end) {
        long count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 21 == 0 && containsDigitThree(i)) {
                count += 1;
            }
        }
        return count;
    }

    private static boolean containsDigitThree(int number) {
        return String.valueOf(number).contains("3");
    }
}
