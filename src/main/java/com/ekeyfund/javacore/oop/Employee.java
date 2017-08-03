package com.ekeyfund.javacore.oop;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Employee
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-27-上午10:36
 * @see
 * @since JDK1.8u141
 */
public class Employee {




    private static int nextId; //获取下一个编号

    /*私有化成员变量 只能在该类中访问*/

    private long id;

    private String name;

    private double salary;

    private LocalDate hireDay;

    /*公共的get set方法  任何类中实例化该对象后都能访问*/


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }


    /**
     * 静态代码块
     * 在类初始化后执行
     */
    static{

        ThreadLocalRandom generator=ThreadLocalRandom.current();
        nextId=generator.nextInt(10000);
    }

    /**
     * 代码块
     * 在对象实例化后被执行
     */
    {
        id=nextId;
        nextId++;
    }

    /*默认无参数的构造器*/
    public Employee(){
        //name=null
        //salary=0.0
        //id=10000

    }


    public Employee(String name,Double salary){
        this.name=name;
        this.salary=salary;
    }

    public Employee(Double salary){
        //调用 Employee(Sting,double)
        this("Employee # "+nextId,salary);
    }



    /*带参数的构造*/
    public Employee(String name, double salary, int year,int month,int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    /*重写父类Object的toString()方法*/

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("salary", salary)
                .append("hireDay", hireDay)
                .toString();
    }

    /**
     * 涨工资
     * @param byPrecent 百分比
     */
    public void raiseSalary(double byPrecent){

        double raise=this.salary*byPrecent/100;
        this.salary+=raise;
    }


}
