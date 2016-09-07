/**
 * <b>项目名：</b>java nio相关知识<br/>
 * <b>包   名：</b>com.glinin.java.io<br/>
 * <b>文件名：</b>Nio.java<br/>
 * <b>版本信息：</b>1.0<br/>
 * <b>日期：</b>2016年9月2日-上午11:05:10<br/>
 * 
 */
package com.glinin.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

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
    
    private static  final byte message[] = { 83, 111, 109, 101, 32,  
            98, 121, 116, 101, 115, 46 };
    
    /**
     * intBufferTest(intBuffer的简单使用)
     *  
     * @exception 
     * @since 1.0
     * @author ningli
     */
    public void intBufferTest() {
        // 分配新的int缓冲区，参数为缓冲区容量
        // 新缓冲区的当前位置将为零，其界限(限制位置)将为其容量。它将具有一个底层实现数组，其数组偏移量将为零。
        IntBuffer intBuffer = IntBuffer.allocate(8);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            int j = 2 * (i + 1);
            intBuffer.put(j);
        }
        // 将给定整数写入此缓冲区的当前位置，当前位置递增
        intBuffer.flip();
        // 查看在当前位置和限制位置之间是否有元素
        while (intBuffer.hasRemaining()) {
            int j = intBuffer.get();
            System.out.println(j + " ");
        }
    }
    
    /**
     * readBuffer(读取数据)
     * 
     *  1. 从FileInputStream获取Channel 
        2. 创建Buffer 
        3. 将数据从Channel读取到Buffer中
     * @exception 
     * @since 4.0
     * @author ningli
     */
    @SuppressWarnings("resource")
    public void readBuffer() {
        try {
            FileInputStream fileInputStream = new FileInputStream(Nio.class.getResource("/").getPath() + "/nio.txt");
            // 获取通道
            FileChannel fileChannel = fileInputStream.getChannel();
            // 创建缓冲区
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            // 读取数据到缓冲区
            fileChannel.read(buffer);
            buffer.flip();

            while (buffer.remaining() > 0) {
                byte b = buffer.get();
                System.out.println(b + " ");
            }
            fileChannel.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * writeBuffer(写数据)
     * 
     *  1. 从FileInputStream获取Channel 
        2. 创建Buffer 
        3. 将数据从Channel写入到Buffer中
     * @exception 
     * @since 4.0
     * @author ningli
     */
    public void writeBuffer() {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(Nio.class.getResource("/").getPath() + "/nio.txt");
           
            FileChannel channel = fileOutputStream.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            
            for (int i = 0; i < message.length; i++) {
                buffer.put(message[i]);
            }
            
            buffer.flip();
            channel.write(buffer);
            
            fileOutputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * buffer(buffer三个属性的变化)
     *  position：指定了下一个将要被写入或者读取的元素索引，它的值由get()/put()方法自动更新，在新创建一个Buffer对        象时，position被初始化为0。
       limit：指定还有多少数据需要取出(在从缓冲区写入通道时)，或者还有多少空间可以放入数据(在从通道读入缓冲区时)。
       capacity：指定了可以存储在缓冲区中的最大数据容量，实际上，它指定了底层数组的大小，或者至少是指定了准许我们使用的底层数组的容量。
     * @exception 
     * @since 4.0
     * @author ningli
     */
    public void buffer() {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(Nio.class.getResource("/").getPath() + "/nio.txt");

            FileChannel channel = fileOutputStream.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);

            output("初始化", buffer);

            channel.read(buffer);
            output("调用read()", buffer);

            buffer.flip();
            output("调用flip()", buffer);

            while (buffer.remaining() > 0) {
                byte b = buffer.get();
                System.out.print(((char) b));
            }
            output("调用get()", buffer);

            buffer.clear();
            output("调用clear()", buffer);

            fileOutputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    /**
     * getSelector(注册事件)
     * 使用NIO中非阻塞I/O编写服务器处理程序，大体上可以分为下面三个步骤：
       1. 向Selector对象注册感兴趣的事件 
       2. 从Selector中获取感兴趣的事件 
       3. 根据不同的事件进行相应的处理
     * @return
     * @throws IOException 
     * @exception 
     * @since 4.0
     * @author ningli
     */
    public Selector getSelector(int port) throws IOException {
        // 创建Selector对象
        Selector selector = Selector.open();
        
        // 创建可选择通道，配置为非阻塞模式
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.configureBlocking(false);
        
        // 绑定通道到指定端口
        ServerSocket serverSocket = channel.socket();
        InetSocketAddress address = new InetSocketAddress(port);
        serverSocket.bind(address);
        
        // 向Selector中注册感兴趣的事件
        channel.register(selector, SelectionKey.OP_ACCEPT);
        return selector;
    }
    
    public static void output(String step, Buffer buffer) {  
        System.out.println(step + " : ");  
        System.out.print("capacity: " + buffer.capacity() + ", ");  
        System.out.print("position: " + buffer.position() + ", ");  
        System.out.println("limit: " + buffer.limit());  
        System.out.println();  
    } 
    
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
