package com.zp.design.principle.dependenceversion;

/**
 * @author zhengpanone
 * @date 2021-04-11-16:15
 * @email zhengpanone@hotmail.com
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习前端课程");
    }
}
