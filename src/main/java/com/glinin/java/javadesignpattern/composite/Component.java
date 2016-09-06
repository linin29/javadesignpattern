/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.composite<br/>
 * <b>文件名：</b>Component.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-下午2:37:55<br/>
 * 
 */
package com.glinin.java.javadesignpattern.composite;

/**
 * <b>类   名：</b>Component<br/>
 * <b>类描述：</b>对象声明接口<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 下午2:37:55<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 下午2:37:55<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public abstract class Component {
    String name;

    public Component(String name) {

        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void foreach();
}
