/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.composite<br/>
 * <b>文件名：</b>Composite.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月6日-下午2:39:29<br/>
 * 
 */
package com.glinin.java.javadesignpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>类   名：</b>Composite<br/>
 * <b>类描述：</b>组合类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 下午2:39:29<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 下午2:39:29<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Composite extends Component {
    private List<Component> child = new ArrayList<Component>();

    public Composite(String s) {
        super(s);
    }

    @Override
    public void add(Component c) {
        child.add(c);

    }

    @Override
    public void foreach() {
        System.out.println("节点名:\t" + name);
        for (Component c : child) {
            c.foreach();
        }
    }

    @Override
    public void remove(Component c) {
        child.remove(c);
    }
}
