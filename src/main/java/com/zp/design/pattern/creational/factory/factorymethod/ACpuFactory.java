package com.zp.design.pattern.creational.factory.factorymethod;

/**
 * @Author: zhengpanone
 * @Description: 具体工厂实现
 * 工厂方法模式下，一个工厂对应一个产品：一个抽象工厂对应抽象产品，一个具体工厂对应一个具体产品
 * @Date:Created in 2021/07/06 12:52.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class ACpuFactory implements CpuFactory {
    @Override
    public Cpu createCpu() {
        return new ACpu();
    }
}
