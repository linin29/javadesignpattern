/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.strategy<br/>
 * <b>文件名：</b>ConcreteStrategyA.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-上午8:52:51<br/>
 * 
 */
package com.glinin.java.javadesignpattern.strategy;

/**
 * <b>类   名：</b>ConcreteStrategyA<br/>
 * <b>类描述：</b>具体策略类
 *                包装了相关的算法或行为<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 上午8:52:51<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 上午8:52:51<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyInterface() {
        System.out.println("ConcreteStrategyA");
    }
}
