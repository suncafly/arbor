package com.suncafly.javaproxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-20 11:44 AM
 */
public class JdkProxySourceClass {

    public static void writeClassToDisk(String path) {
        byte[] classFile = ProxyGenerator.generateProxyClass("$proxy1", new Class[]{Car.class});
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(path);
            fos.write(classFile);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    @Test
//    public void testGenerateProxyClass() {
//        JdkProxySourceClass.writeClassToDisk("D:/$Proxy4.class");
//    }
}
