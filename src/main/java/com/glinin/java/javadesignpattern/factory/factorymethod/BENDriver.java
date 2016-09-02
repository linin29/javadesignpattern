/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.factorymethod<br/>
 * <b>文件名：</b>BENDriver.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月2日-上午9:04:49<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.factorymethod;

/**
 * <b>类   名：</b>BENDriver<br/>
 * <b>类描述：</b>具体工厂类（BENDriver）
 *                具体工厂角色：它含有和具体业务逻辑有关的代码。
 *                由应用程序调用以创建对应的具体产品的对象<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月2日 上午9:04:49<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月2日 上午9:04:49<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class BENDriver implements Driver {

    @Override
    public Car driverCar() {
        return new BENCar();
    }
}
