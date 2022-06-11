package com.java.car;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        question1();
    }

    private static void question1() {
        Car bmwCar = new BMWCar(300);
        Car toyotaCar = new ToyotaCar(200);

        bmwCar.run();
        toyotaCar.run();
        // The output of question 1 will print out the max speed of those cars sequentially (BMW first then toyota)
    }

    private static void question2() {
        Car bmwCar = new BMWCar(300);
        Car toyotaCar = new ToyotaCar(200);

        Thread thread1 = new Thread(bmwCar);
        Thread thread2 = new Thread(toyotaCar);

        thread1.start();
        thread2.start();

        /**The output of question 2 will print out the max speed of the cars (not in the order) by using different threads
         * which are run simultaneously.
        **/
    }

    private static void question3() throws InterruptedException {
        Car bmwCar = new BMWCar(300);
        Car toyotaCar = new ToyotaCar(200);

        Thread thread1 = new Thread(bmwCar);
        Thread thread2 = new Thread(toyotaCar);

        thread1.start();
        thread1.join();
        thread2.start();

        // I will using the thread join, the program will wait until the thread1 is terminated.
    }

    public static void question4() {
        // I have no idea to solve it now
    }
}
