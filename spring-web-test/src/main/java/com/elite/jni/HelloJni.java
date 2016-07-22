package com.elite.jni;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wjc133
 * Date: 2016/6/21
 * Time: 19:42
 */
public class HelloJni {
    private static final HelloJni HELLO_JNI = new HelloJni();
    static {
        InputStream in = null;
        FileOutputStream out = null;
        try {
            ClassLoader cl = HelloJni.class.getClassLoader();
            in = cl.getResourceAsStream("libHelloJni.so");
            File library = File.createTempFile("libHelloJni", ".so");
            library.deleteOnExit();
            out = new FileOutputStream(library);
            int i;
            byte[] buf = new byte[1024];
            while ((i = in.read(buf, 0, buf.length)) > 0) {
                out.write(buf, 0, i);
            }
            System.load(library.toString());
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public native void display();

    public native void setName(String name);

    public static HelloJni getInstance(){
        return HELLO_JNI;
    }
}
