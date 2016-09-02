/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.factory.factorymethod<br/>
 * <b>文件名：</b>Driver.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月2日-上午8:54:01<br/>
 * 
 */
package com.glinin.java.javadesignpattern.factory.factorymethod;

/**
 * <b>类   名：</b>Driver<br/>
 * <b>类描述：</b>抽象工厂类（驾驶类）
 *                抽象工厂角色：这是工厂方法模式的核心，它与应用程序无关。
 *                是具体工厂角色必须实现的接口或者必须继承的父类。
 *                在java中它由抽象类或者接口来实现<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月2日 上午8:54:01<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月2日 上午8:54:01<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public interface Driver {

    /**
     * driverCar(驾驶具有驾驶车的功能)
     * 
     * @return 
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public Car driverCar();
}
