package com.zp.design.principle.singleresponsibility;

/**
 * @author zhengpanone
 * @date 2021-04-11-17:29
 * @email zhengpanone@hotmail.com
 */
public class Test {
    public static void main(String[] args) {
        /*Bird bird = new Bird();
        bird.moveMode("大雁");
        bird.moveMode("鸵鸟");*/
        FlyBird flyBird = new FlyBird();
        flyBird.moveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.moveMode("鸵鸟");
    }
}
