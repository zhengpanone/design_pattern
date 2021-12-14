package com.zp.design.pattern.creational.factory.factorymethod;

/**
 * @Author: zhengpanone
 * @Description: 抽象工厂
 * CPU这个产品类型的抽象工厂
 * @Date:Created in 2021/07/06 12:49.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public interface CpuFactory {
    /**
     * 这是CPU产品的工厂,专门生产CPU,返回的类型是对应产品的抽象类型
     * @return CPU 接口
     */
    Cpu createCpu();
}
