package com.arbor.basic;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-17 10:07 PM
 */
public class EscapeCharacter {

    public static void main(String[] args) {
        char c1 = '\'';
//        String c2 = "";
        System.out.println(c1);
        shortConvertByteTest();
        floatTest();
        bigFloat();
    }


    public static void shortConvertByteTest() {
        final short s = -20;
        byte b = s;
        System.out.println(b);
    }


    public static void floatTest() {
//        for (float f = 10.1f; f != 11; f += 0.1f) {
//            System.out.println(f);
//        }
        float f = 10.1f;
        f += 0.1f;
        System.out.println(f);
    }


    public static void bigFloat(){
//        System.out.println("this is a bigFloat");
        float f1 = 30000000;
        float f2 = f1 + 1;
        System.out.println("f1=" + f1 + ", f2=" + f2);
        if( f1 < f2){
            System.out.println("f1 < f2");
        }
////        BigDecimal bigDecimal= new  BigDecimal(30000000);
////        BigDecimal a  = new BigDecimal(1);
////        bigDecimal.add(a);
////        System.out.println(bigDecimal.floatValue());
    }


}
