package com.zp.design.principle.dependenceversion;

/**
 * @author zhengpanone
 * @date 2021-04-11-16:13
 * @email zhengpanone@hotmail.com
 * 依赖倒置原则
 */
public class Test {
    public static void main(String[] args) {
        /*
        V1
        Geely geely = new Geely();
        geely.studyJavaCourse();
        geely.studyFECourse();*/

        /*
        V2 接口方法注入
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());*/

        /*// V3 构造器注入
        Geely geely = new Geely(new JavaCourse());
        geely.studyImoocCourse();
        Geely geely1 = new Geely(new FECourse());
        geely1.studyImoocCourse();*/
// V4 Setter 注入方式
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();

    }
}
