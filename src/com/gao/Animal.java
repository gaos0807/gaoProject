package com.gao;

/**
 * Created by Administrator on 2019/3/14.
 */
public class Animal implements Talking{
    private  String name;
    private  int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void say() {
        System.out.print(name + "\tAnimal say\n");
    }
}
