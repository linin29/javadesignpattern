/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.observer<br/>
 * <b>文件名：</b>Writer.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午8:45:32<br/>
 * 
 */
package com.glinin.java.javadesignpattern.observer;

import java.util.Observable;

/**
 * <b>类   名：</b>Writer<br/>
 * <b>类描述：</b>作者类, 继承自被观察者类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午8:45:32<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午8:45:32<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Writer extends Observable {

    private String name;

    private String lastNovel;

    public Writer(String name) {
        super();
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    // 作者发布新小说了，要通知所有关注自己的读者
    public void addNovel(String novel) {
        System.out.println(name + "发布了新书《" + novel + "》！");
        lastNovel = novel;
        setChanged();
        notifyObservers();
    }

    public String getLastNovel() {
        return lastNovel;
    }

    public String getName() {
        return name;
    }
}
