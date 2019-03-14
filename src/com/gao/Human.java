package com.gao;

/**
 * Created by Administrator on 2019/3/14.
 */
public class Human extends Animal {
    private String country;

    public Human(String name,int age,String country){
        super(name,age);
        this.country = country;
    }

    @Override
    public void say() {
        System.out.print("This is Human from\t" + country+"\n");
    }
}
