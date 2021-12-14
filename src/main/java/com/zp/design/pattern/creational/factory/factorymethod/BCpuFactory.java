package com.zp.design.pattern.creational.factory.factorymethod;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 12:54.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class BCpuFactory implements CpuFactory {
    @Override
    public Cpu createCpu() {
        return new BCpu();
    }
}
