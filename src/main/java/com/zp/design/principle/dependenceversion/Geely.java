package com.zp.design.principle.dependenceversion;

/**
 * @author zhengpanone
 * @date 2021-04-11-16:11
 * @email zhengpanone@hotmail.com
 */
public class Geely {
    private ICourse iCourse;

    // V4 Setter注入方式
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /* V3构造器注入
   public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }*/

    /*V2
    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }*/

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
