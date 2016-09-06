/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.composite<br/>
 * <b>文件名：</b>Leaf.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-下午2:42:01<br/>
 * 
 */
package com.glinin.java.javadesignpattern.composite;

/**
 * <b>类   名：</b>Leaf<br/>
 * <b>类描述：</b>叶子节点对象<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 下午2:42:01<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 下午2:42:01<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Leaf extends Component {
    
    public Leaf(String s) {
        super(s);
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void foreach() {
        System.out.println("tself name-->" + this.name);
    }

    @Override
    public void remove(Component c) {

    }
}
