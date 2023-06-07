package org.example;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        long start = System.currentTimeMillis();

        String path = "/Users/kubaobara/Desktop/Screenshot 2023-06-06 at 13.57.30.png";
        ImageProcessor imageProcessor = new ImageProcessor();
        imageProcessor.loadImage(path);
        imageProcessor.setBrightness(100);
        imageProcessor.saveImage("/Users/kubaobara/Studia/WykladOOP/lab13/src/pliczek.png");

        long end = System.currentTimeMillis();
        System.out.println(start-end);


    }

}
//        int cores = Runtime.getRuntime().availableProcessors();
//
//        Thread thread1 = new Thread(() ->{
//            /////
//        });
//        Thread thread2 = new Thread(() ->{
//            /////
//        });
//
//        thread1.start();
//        thread2.start();
//
//        thread1.join();
//        thread2.join();
//
//        ExecutorService executorService = Executors.newFixedThreadPool(cores);
//        executorService.execute(() ->{
//            ///
//        });
//        executorService.execute(() ->{
//            ///
//        });
//
//        executorService.shutdown();
//        if(executorService.isTerminated()){
//            ///
//        }