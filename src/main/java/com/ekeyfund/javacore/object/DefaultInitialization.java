package com.ekeyfund.javacore.object;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default Initialization
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-25-下午2:16
 * @see
 * @since JDK1.8u141
 */
public class DefaultInitialization {


    private static final Logger logger = LogManager.getLogger(DefaultInitialization.class);

    public static void main(String[]args){

        Employee employee =new Employee();

        logger.info(employee);

    }
}


/**
 * 自定义类Employee
 */
class Employee{


    /*私有化成员变量*/
    private int age; //init value 0

    private double salary; //init value 0.0

    private String userName; //init value null

    private String password; //init value null

    private boolean isReal; //是否实名制  init value false



    /*公共的get set 方法*/
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    /*默认无参数的构造器*/
    public Employee() {

    }

    /*全参数的构造器*/
    public Employee(int age, double salary, String userName, String password,boolean isReal) {
        this.age = age;
        this.salary = salary;
        this.userName = userName;
        this.password = password;
        this.isReal=isReal;
    }

    /*重写父类Object的toString方法*/
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("age", age)
                .append("salary", salary)
                .append("userName", userName)
                .append("password", password)
                .append("isReal",isReal)
                .toString();
    }
}
