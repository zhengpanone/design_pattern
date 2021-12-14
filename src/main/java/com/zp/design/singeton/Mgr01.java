package com.zp.design.singeton;

/**
 * Mgr01 饿汉式 类加载到内存中,就实例化一个单例,JVM保证线程安全
 * 缺点: 不管是否使用,类加载时就完成实例化
 *
 * @author zhengpanone
 * @since 2021-12-14
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 m1 =  Mgr01.getInstance();
        Mgr01 m2 =  Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
