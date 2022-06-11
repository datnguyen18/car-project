package com.java.car;

public class Car implements Runnable {
    private int wheels = 4;
    private int seats = 5;
    private int doors = 4;
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.maxSpeed);
            try {
                Thread.sleep(this.maxSpeed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void info() {
        StringBuffer sb = new StringBuffer();
        sb.append("wheels = " + this.wheels + "\n");
        sb.append("seats = " + this.seats + "\n");
        sb.append("doors = " + this.doors + "\n");
        sb.append("maxSpeed = " + this.maxSpeed + "\n");
        System.out.println(sb);
    }
}
