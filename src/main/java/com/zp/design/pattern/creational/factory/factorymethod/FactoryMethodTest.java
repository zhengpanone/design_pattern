package com.zp.design.pattern.creational.factory.factorymethod;

/**
 * @Author: zhengpanone
 * @Description:
 * @Date:Created in 2021/07/06 12:55.
 * @Email zhengpanone@hotmail.com
 * @Modified By:
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        CpuFactory aCpuFactory = new ACpuFactory();
        CpuFactory bCpuFactory = new BCpuFactory();
        Cpu aCpu = aCpuFactory.createCpu();
        Cpu bCpu = bCpuFactory.createCpu();
        aCpu.calculate();
        bCpu.calculate();
    }
}
