package com.zp.design.pattern.creational.factory.factorymethod;

/**
 * @Author: zhengpanone
 * @Description: 具体实现
 * 产品的具体实现-A的CPU
 * @Date:Created in 2021/07/06 12:44.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class ACpu implements Cpu {
    @Override
    public void calculate() {
        System.out.println("this is A Cpu");
    }
}
