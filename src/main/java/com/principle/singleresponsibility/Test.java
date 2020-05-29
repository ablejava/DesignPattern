package com.principle.singleresponsibility;

/**
 * Created by ablejava
 */
public class Test {
    /**
     * 单一职责原则
     * @param args
     */
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

    }
}
