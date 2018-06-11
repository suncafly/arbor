package com.arbor.demo;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-06-02 7:39 PM
 */
public class HashCodeAndEquals {



    public static void main(String[] args) {
        Stu stu1 = new Stu(1, "lifang");
        Stu stu2 = new Stu(1, "lifang");
//        stu2.setAge(2);
        Set<Stu> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        System.out.println(set.size());
        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
    }


}


class Stu{

    private int age;
    private String name;

    public Stu(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean equalObjects = false;
        if(obj != null && this.getClass() == obj.getClass()){
            Stu stu = (Stu)obj;
            equalObjects = this.name.equals(stu.name) && this.age == stu.age;
        }
        return equalObjects;
    }

    @Override
    public int hashCode() {
        int hashCode = + (151513 *229) + this.name.hashCode() + this.age;
        return hashCode;
    }
}