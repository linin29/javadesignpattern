/**
 * <b>项目名：</b>java nio相关知识<br/>
 * <b>包   名：</b>com.glinin.java.io<br/>
 * <b>文件名：</b>Nio.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月2日-上午11:05:10<br/>
 * 
 */
package com.glinin.java.io;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * <b>类   名：</b>Nio<br/>
 * <b>类描述：</b>java nio相关知识<br/>
 * <b>创建人：</b>ningli<br/>
 * <b>创建时间：</b>2016年9月2日 上午11:05:10<br/>
 * <b>修改人：</b>ningli<br/>
 * <b>修改时间：</b>2016年9月2日 上午11:05:10<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0<br/>
 * 
 */
public class Nio {
    
    public static void main(String[] args) {
        try {
            RandomAccessFile accessFile = new RandomAccessFile(Nio.class.getResource("/").getPath()+"/nio.txt", "rw");
            FileChannel channel = accessFile.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(48);
            int byteLength = channel.read(buffer);

            while (byteLength != -1) {

                System.out.println("read" + byteLength);
                buffer.flip();

                while (buffer.hasRemaining()) {
                    System.out.println((char) buffer.get());
                }

                buffer.clear();
                byteLength = channel.read(buffer);
            }
            accessFile.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
