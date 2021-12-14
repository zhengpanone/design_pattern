package com.zp.design.pattern.creational.factory.simplefactory;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 10:25.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class JavaVideo extends  Video {
    @Override
    public void produce() {
        System.out.println("Java课程视频");
    }
}
