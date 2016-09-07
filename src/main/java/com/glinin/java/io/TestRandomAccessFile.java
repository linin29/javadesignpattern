/**
 * <b>项目名：</b>java nio<br/>
 * <b>包   名：</b>com.glinin.java.io<br/>
 * <b>文件名：</b>TestRandomAccessFile.java<br/>
 * <b>版本信息：</b>4.0<br/>
 * <b>日期：</b>2016年9月6日-下午4:21:13<br/>
 * 
 */
package com.glinin.java.io;

import java.io.RandomAccessFile;

/**
 * <b>类   名：</b>TestRandomAccessFile<br/>
 * <b>类描述：</b>RandomAccessFile测试类<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月6日 下午4:21:13<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月6日 下午4:21:13<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 4.0<br/>
 * 
 */
public class TestRandomAccessFile {

    public static void main(String[] args) {
        RandomAccessFile rf;
        try {
            rf = new RandomAccessFile(TestRandomAccessFile.class.getResource("/").getPath()+"/nio.txt", "rw");

            for (int i = 0; i < 10; i++) {
                // 写入基本类型double数据
                rf.writeDouble(i * 1.414);
            }
            rf.close();
            rf = new RandomAccessFile(TestRandomAccessFile.class.getResource("/").getPath()+"/nio.txt", "rw");
            // 直接将文件指针移到第5个double数据后面
            rf.seek(5 * 8);
            // 覆盖第6个double数据
            rf.writeDouble(47.0001);
            rf.close();
            rf = new RandomAccessFile(TestRandomAccessFile.class.getResource("/").getPath()+"/nio.txt", "r");
            for (int i = 0; i < 10; i++) {
                System.out.println("Value " + i + ": " + rf.readDouble());
            }
            rf.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
