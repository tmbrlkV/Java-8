package lesson160315;

public class Timing {

    interface Op {
        void runOp();
    }

    public static long time(Runnable operation) {
        long start = System.currentTimeMillis();

        operation.run();

        long finish = System.currentTimeMillis();

        return finish - start;
    }

    public static void main(String[] args) {
        long elapsed = time(() -> sortBigArray());
        time(Timing::sortBigArray); /// equals
        System.out.println(elapsed);
    }

    private static void sortBigArray() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
