package com.zp.design.principle.dependenceversion;

/**
 * @author zhengpanone
 * @date 2021-04-11-16:15
 * @email zhengpanone@hotmail.com
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
