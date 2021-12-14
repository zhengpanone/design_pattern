package com.zp.design.singeton;

/**
 * Mgr04 懒汉式
 * 通过synchronized解决, 然而效率低下
 *
 * @author zhengpanone
 * @since 2021-12-14
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;
    private Mgr04(){}
    private static synchronized Mgr04 getInstance(){
        if(INSTANCE==null){
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Mgr04.getInstance().hashCode())).start();
        }
    }
}
