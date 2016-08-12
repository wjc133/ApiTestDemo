package com.elite.jdk.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by wjc133
 * Date: 2016/7/22
 * Time: 19:44
 */
public class MappedByteBufferTest {
    public static void main(String[] args) throws Exception {
        ByteBuffer byteBuffer = ByteBuffer.allocate(128 * 1024 * 1024);
        byte[] b = new byte[128 * 1024 * 1024];
        FileInputStream fis = new FileInputStream("f:/test/text.txt");
        FileOutputStream fos = new FileOutputStream("f:/test/test2.txt");
        FileChannel channel = fis.getChannel();

        long timeStar = System.currentTimeMillis();

        channel.read(byteBuffer);

        long timeEnd = System.currentTimeMillis();

        System.out.println("读取时间为：" + (timeEnd - timeStar) + "ms");

        fos.write(b);
        fos.flush();
        channel.close();
        fis.close();
        fos.close();
    }
}
