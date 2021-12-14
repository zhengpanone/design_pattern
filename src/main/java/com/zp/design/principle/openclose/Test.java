package com.zp.design.principle.openclose;

/**
 * 开闭原则
 */
public class Test {
    public static void main(String[] args) {
//        ICourse iCourse = new JavaCourse(96, "Java电商开发", 348d);
        ICourse iCourse = new JavaDiscountCourse(96, "Java电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("原价:" + javaCourse.getOriginPrice());
        System.out.println("课程ID:" + javaCourse.getId() + "课程价格" + javaCourse.getPrice());
    }
}
