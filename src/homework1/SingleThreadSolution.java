package homework1;

public class SingleThreadSolution {
    public static void main(String[] args) {
        long count = countNumbersSingleThread();
        System.out.println("Rezultat v odnom potoke : " + count);
    }

    public static long countNumbersSingleThread() {
        long count = 0;
        for (int i = 1; i <= 2_000_000_000; i++) {
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
