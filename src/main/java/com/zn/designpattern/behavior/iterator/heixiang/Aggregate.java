package com.zn.designpattern.behavior.iterator.heixiang;


/**
 * 抽象聚集角色类：
 * 这个角色规定出所有的具体聚集必须实现的接口，迭代子模式要求聚集对象必须有一个工厂方法，也就是createIterator()方法，以向外界提供迭代子对象的实例
 * Created by zhoun on 2018/7/4.
 **/
public abstract class Aggregate {

    /**
     * 工厂方法 创建响应迭代子对象的接口
     */
    abstract Iterator createIterator();
}
