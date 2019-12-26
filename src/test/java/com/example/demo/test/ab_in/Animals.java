package com.example.demo.test.ab_in;

/**
 * Animals :
 *
 * @author : Trevor.yang
 * since: 2019/12/26 13:32
 */
public abstract class Animals {
    public String name;
    public abstract void bark();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

