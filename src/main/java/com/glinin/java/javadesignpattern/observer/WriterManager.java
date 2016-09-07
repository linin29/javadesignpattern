/**
 * <b>项目名：</b>java设计模式<br/>
 * <b>包   名：</b>com.glinin.java.javadesignpattern.observer<br/>
 * <b>文件名：</b>WriterManager.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月7日-上午8:44:50<br/>
 * 
 */
package com.glinin.java.javadesignpattern.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>类   名：</b>WriterManager<br/>
 * <b>类描述：</b>管理器类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月7日 上午8:44:50<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月7日 上午8:44:50<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class WriterManager {

    private Map<String, Writer> writerMap = new HashMap<String, Writer>();
    
    public void add(Writer writer){
        writerMap.put(writer.getName(), writer);
    }
    
    //根据作者姓名获取作者
    public Writer getWriter(String name){
        return writerMap.get(name);
    }
    
    
    private WriterManager(){}
    
    public static WriterManager getInstance(){
        return WriterManagerInstance.instance;
    }
    
    private static class WriterManagerInstance{
        private static WriterManager instance = new WriterManager();
    }
}
