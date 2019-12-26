package com.example.demo.test.design_pattern;

/**
 * SingleObject : 单例
 *
 * @author : Trevor.yang
 * since: 2019/12/26 18:00
 */
public class SingleObject {

    private static SingleObject instance;

    private SingleObject(){}
    public void showMessage() {
        System.out.println("fuckyou");
    }
    public static SingleObject getInstance() {
        if (instance == null) {
            instance = new SingleObject();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
