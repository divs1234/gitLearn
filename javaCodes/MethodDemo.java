package learnJava;

import java.util.Random;

public class MethodDemo {
    public static void playWithGenerator() {
        System.out.println(new Random().nextInt());

        Random gen = new Random();

        System.out.println(gen.nextInt());
        System.out.println(gen.nextInt());
    }

    public static void main(String[] args) {
        System.out.println("hi");

        playWithGenerator();
    }
}
