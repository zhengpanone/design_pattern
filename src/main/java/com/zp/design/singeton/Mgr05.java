package com.zp.design.singeton;

/**
 * Mgr05 懒汉式
 *
 *
 * @author zhengpanone
 * @since 2021-12-14
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {
    }

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            // 通过减少同步代码块的方式提高效率,然而不行
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mgr05.getInstance().hashCode())).start();
        }
    }
}
