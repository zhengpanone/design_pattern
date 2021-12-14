package com.zp.design.pattern.creational.factory.factorymethod;

/**
 * @Author: zhengpanone
 * @Description: 具体实现
 * 产品的具体实现-B的Cpu
 * @Date:Created in 2021/07/06 12:48.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class BCpu implements Cpu {
    @Override
    public void calculate() {
        System.out.println("this is B Cpu");
    }
}
