package singleton.databases;

public class SingletonTest {
    private static final int PROCESSOR_COUNT = Runtime.getRuntime().availableProcessors();
    private static final Thread[] THREADS = new Thread[PROCESSOR_COUNT];
    private static int instancesCount = 0;
    private static SingletonTest instance = null;

    /**
     * private constructor to prevent Creation of Object from Outside of the
     * This class.
     */
    private SingletonTest() {
    }

    /**
     * return the instance only if it does not exist
     */
    public static SingletonTest getInstance() {
        if (instance == null) {
            instancesCount++;
            instance = new SingletonTest();
        }
        return instance;
    }

    /**
     * reset instancesCount and instance.
     */
    private static void reset() {
        instancesCount = 0;
        instance = null;
    }

    /**
     * validate system to run the test
     */
    private static void validate() {
        if (SingletonTest.PROCESSOR_COUNT < 2) {
            System.out.print("PROCESSOR_COUNT Must be >= 2 to Run the test.");
            System.exit(0);
        }
    }

    public static void main(String... args) {
        validate();
        System.out.printf("Summary :: PROCESSOR_COUNT %s, Running Test with %s of Threads. %n", PROCESSOR_COUNT,
                PROCESSOR_COUNT);

        long currentMili = System.currentTimeMillis();
        int testCount = 0;
        do {
            reset();

            for (int i = 0; i < PROCESSOR_COUNT; i++)
                THREADS[i] = new Thread(SingletonTest::getInstance);

            for (int i = 0; i < PROCESSOR_COUNT; i++)
                THREADS[i].start();

            for (int i = 0; i < PROCESSOR_COUNT; i++)
                try {
                    THREADS[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            testCount++;
        } while (instancesCount <= 1 && testCount < Integer.MAX_VALUE);

        System.out.printf(
                "Singleton Pattern is broken after %d try. %nNumber of instances count is %d. %nTest duration %dms",
                testCount, instancesCount, System.currentTimeMillis() - currentMili);
    }
}
