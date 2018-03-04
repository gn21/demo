package com.lianjia.java8.optional;

import com.lianjia.entity.Employee;
import org.junit.Test;

import java.util.Optional;
import java.util.function.Predicate;

/**
 * Optional类的常用方法：
 * Optional.of(T t): 创建一个Optional实例
 * Optional.empty():创建空的Optional实例
 * Optional.ofNullable(T t)：若t不为null，创建Optional实例，否则创建空实例
 * isPresent()：判断是否包含值
 * orElse(T t)：如果调用对象包含值，返回该值；否则返回t
 * ofElseGet(Supplier s):如果调用对象包含值，返回该值；否则返回s获取的值
 * map(Function f):如果有值对其处理，并返回处理后的Optional，否则返回空的Optional实例
 * flatMap
 * Created by chen on 2018/2/18.
 */
public class TestOptional {

    @Test
    public  void test1(){
        Optional<Employee> optional = Optional.of(new Employee());
        Employee employee = optional.get();
        System.out.println(employee);
    }
    @Test
    public  void test2(){
        Optional<Object> optional = Optional.empty();
        System.out.println(optional.get());
    }
    @Test
    public  void test3(){


    }

}
