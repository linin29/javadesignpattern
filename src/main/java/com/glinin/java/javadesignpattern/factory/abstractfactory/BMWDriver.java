/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.abstractfactory<br/>
 * <b>文件名：</b>BMWDriver.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月2日-上午9:07:06<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.abstractfactory;

/**
 * <b>类   名：</b>BMWDriver<br/>
 * <b>类描述：</b>具体工厂类（BMWDriver）
 *                具体工厂角色：它含有和具体业务逻辑有关的代码。
 *                由应用程序调用以创建对应的具体产品的对象<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月2日 上午9:07:06<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月2日 上午9:07:06<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class BMWDriver implements Driver {

    @Override
    public Car driverCar() {
        return new BMWCar();
    }

    @Override
    public CarA driverCarA() {
        return new BMWCarA();
    }
}
