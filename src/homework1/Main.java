package homework1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long singleThreadResult = SingleThreadSolution.countNumbersSingleThread();
        long multiThreadResult = MultiThreadSolution.countNumbersTwoThreads();

        System.out.println("Rezultat v odnom potoke: " + singleThreadResult);
        System.out.println("Rezultat v dvuh potokah: " + multiThreadResult);

        if (singleThreadResult == multiThreadResult) {
            System.out.println("Rezultaty sovpadajut.");
        } else {
            System.out.println("Rezultaty ne sovpadajut.");
        }
    }
}
