package com.zp.design.principle.singleresponsibility;

/**
 * @author zhengpanone
 * @date 2021-04-11-17:28
 * @email zhengpanone@hotmail.com
 */
public class Bird {
    public void moveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }


    }
}
