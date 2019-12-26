package com.example.demo.test.ab_in;

/**
 * Bird :
 *
 * @author : Trevor.yang
 * since: 2019/12/26 13:42
 */
public class Bird extends Animals implements Fly {
    @Override
    public void bark() {
        System.out.println("叽叽叽");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }
}
