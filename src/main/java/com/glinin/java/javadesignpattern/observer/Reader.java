/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.observer<br/>
 * <b>文件名：</b>Reader.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午8:40:11<br/>
 * 
 */
package com.glinin.java.javadesignpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * <b>类   名：</b>Reader<br/>
 * <b>类描述：</b>读者类，实现观察者接口<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午8:40:11<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午8:40:11<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Reader implements Observer {

    private String name;

    public Reader(String name) {
        super();
        this.name = name;
    }

    // 读者可以关注某一位作者，关注则代表把自己加到作者的观察者列表里
    public void subscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).addObserver(this);
    }

    // 读者可以取消关注某一位作者，取消关注则代表把自己从作者的观察者列表里删除
    public void unsubscribe(String writerName) {
        WriterManager.getInstance().getWriter(writerName).deleteObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof Writer) {
            Writer writer = (Writer) observable;
            System.out.println(name + "知道" + writer.getName() + "发布了新书《" + writer.getLastNovel() + "》，非要去看！");
        }
    }

    public String getName() {
        return name;
    }
}
