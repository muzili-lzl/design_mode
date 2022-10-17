package com.muzili.singleton;

/**
 * 静态内部类
 * 静态内部类是在懒汉式的基础上再次进行完善的方式
 * 由JVM保证单例
 * 加载外部类的时候并不会加载内部类，这样可以实现懒加载
 * @author lizuoliang
 * @create 2022/10/17 18:25
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){};

    private static class StaticInnerClass{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public StaticInnerClassSingleton getInstance(){
        return StaticInnerClass.INSTANCE;
    }

}
