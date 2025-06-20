package javafile;
import java.lang.Runnable;
public class Javafile {
    public static void main(String[] args) {
        // Create and start three threads
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        Thread thread3 = new Thread(new MyRunnable("Thread 3"));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyRunnable implements Runnable {
        private String threadName;

        public MyRunnable(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ": " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

Example 

package javafile;
import java.util.Random;

public class Javafile {
    public static void main(String[] args) {
        Thread randomNumberGenerator = new Thread(new RandomNumberGenerator(), "RandomNumberGenerator");
        Thread evenSquareThread = new Thread(new EvenSquareThread(), "EvenSquareThread");
        Thread oddCubeThread = new Thread(new OddCubeThread(), "OddCubeThread");

        randomNumberGenerator.start();
        evenSquareThread.start();
        oddCubeThread.start();
    }

   static class RandomNumberGenerator implements Runnable {
        static Random random = new Random();

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    int randomNumber = random.nextInt(100); 
                    System.out.println("Generated Random Number: " + randomNumber);
                    
                    synchronized (this) {
                        this.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class EvenSquareThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (RandomNumberGenerator.class) {
                    try (
                        RandomNumberGenerator.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (RandomNumberGenerator.random % 2 == 0) {
                    int square = RandomNumberGenerator.random * RandomNumberGenerator.random;
                    System.out.println("Square of " + RandomNumberGenerator.random + " is " + square);
                }
            }
        }
    }

    static class OddCubeThread implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (RandomNumberGenerator.class) {
                    try {
                        RandomNumberGenerator.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (RandomNumberGenerator.random % 2 != 0) {
                    int cube = RandomNumberGenerator.random * RandomNumberGenerator.random * RandomNumberGenerator.random;
                    System.out.println("Cube of " + RandomNumberGenerator.random + " is " + cube);
                }
            }
        }
    }
}
