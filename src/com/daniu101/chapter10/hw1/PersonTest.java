package com.daniu101.chapter10.hw1;

public class PersonTest {
    public static void main(String[] args) {
       com.daniu101.chapter10.hw1.Person pe = new Person();


        pe.setHeight(60);
        pe.setAge(20);

        System.out.println(pe.toString());
//        System.out.println("身高：" + pe.getHeight());
//        System.out.println("年龄：" + pe.getAge());

        pe.eat();
        pe.run(90);

    }
}
