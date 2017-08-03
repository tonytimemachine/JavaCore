package com.ekeyfund.javacore.oop;

import com.ekeyfund.javacore.object.ShowProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Objects;

/**
 * EmployeeTest
 *
 * @author tony liuguanglei@ekeyfund.com
 * @create 2017-07-27-上午11:01
 * @see
 * @since JDK1.8u141
 */
public class EmployeeTest {


    private static final Logger logger = LogManager.getLogger(EmployeeTest.class);


    static Employee[] employees=new Employee[3];



    @BeforeTest //在运行raiseSalary方法之前执行
    public void initEmployee(){


        //实例化Employee对象,会调用对应参数的构造器
        employees[0]=new Employee("Tony",75000,1988,12,15);
        employees[1]=new Employee("Angel",100000,1990,11,15);
        employees[2]=new Employee("Jim",120000,1987,10,15);


        for(Employee employee:employees){

            logger.info("init employees "+ employee);

        }
    }

    @Test
    public void raiseSalary(){

        for(Employee employee:employees){
            //每个员工涨薪资百分之五
            employee.raiseSalary(5);
        }

        //遍历Employee数组,输出涨薪百分之五后的薪水
        for(Employee employee:employees){

            logger.info(employee);
        }

    }



}
