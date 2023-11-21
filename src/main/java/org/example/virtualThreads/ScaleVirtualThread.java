package org.example.virtualThreads;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicLong;

public class ScaleVirtualThread {

    private static final int NUMBER_OF_VIRTUAL_THREADS = 100_000_000;
    private static final int PRINT_STEP = Math.min(NUMBER_OF_VIRTUAL_THREADS / 10, 100_000);

    /*
     * Scale the number of virtual threads up until OutOfMemoryError is thrown
     */
    public static void main(String[] args)  {
        AtomicLong counter = new AtomicLong(0);

        for (int i = 0; i < NUMBER_OF_VIRTUAL_THREADS; i++) {
            Thread.ofVirtual().start(() -> {
                counter.incrementAndGet();
                try {
                    Thread.sleep(Duration.ofDays(100));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });

            if (i % PRINT_STEP == 0) {
                System.out.println("Running threads: " + counter.get());

            }

        }


    }


}
