package org.example.virtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadExample {

    /*
     * Using the ExecutorService to manage a pool of virtual threads
     */
    public static void executeVirtualThread() {
        System.out.println("There are " + getNumberOfCores() + " available platform threads");
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 100_000_000).forEach(i -> executorService.submit(() -> {
                System.out.println("Virtual thread: " + i);
                Thread.sleep(1000);
                return i;
            }));
        }
    }

    /*
     * This method creates a virtual thread for each task
     */
    public static void createVirtualThread() {
        IntStream.range(0, 10_000).forEach(i -> Thread.startVirtualThread(() -> {
            System.out.println("Virtual thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));
    }


    public static int getNumberOfCores() {
        return Runtime.getRuntime().availableProcessors();
    }
}
