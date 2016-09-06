/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.strategy<br/>
 * <b>文件名：</b>Context.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-上午8:55:32<br/>
 * 
 */
package com.glinin.java.javadesignpattern.strategy;

/**
 * <b>类   名：</b>Context<br/>
 * <b>类描述：</b>环境角色类
 *                持有一个Strategy的引用<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 上午8:55:32<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 上午8:55:32<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Context {

    /** 持有一个具体策略的对象 */
    private Strategy strategy;

    /**
     * 创建一个新的实例 Context.
     *
     * @param strategy 具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * contextInterface(策略方法)
     *  
     * @exception 
     * @since 4.0
     * @author ningli
     */
    public void contextInterface() {
        strategy.strategyInterface();
    }
}
