/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.adapter<br/>
 * <b>文件名：</b>ClazzAdapter.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午9:39:10<br/>
 * 
 */
package com.glinin.java.javadesignpattern.adapter;

/**
 * <b>类   名：</b>ClazzAdapter<br/>
 * <b>类描述：</b>类适配器 适配器把源接口转换成目标接口<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午9:39:10<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午9:39:10<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class ClazzAdapter extends Adaptee implements Target{

    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {
        // TODO Auto-generated method stub
        
    }

}
