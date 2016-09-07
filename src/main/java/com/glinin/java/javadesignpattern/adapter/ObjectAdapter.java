/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.adapter<br/>
 * <b>文件名：</b>ObjectAdapter.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午9:41:50<br/>
 * 
 */
package com.glinin.java.javadesignpattern.adapter;

/**
 * <b>类   名：</b>ObjectAdapter<br/>
 * <b>类描述：</b>对象适配器类 <br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午9:41:50<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午9:41:50<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class ObjectAdapter {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有方法sampleOperation1 因此适配器类直接委派即可
     */
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2 因此由适配器类需要补充此方法
     */
    public void sampleOperation2() {
        // 写相关的代码
    }
}
