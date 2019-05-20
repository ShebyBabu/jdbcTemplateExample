package com.stackroute;

import com.stackroute.Customer;
import com.stackroute.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


        public static void main(String[] args) {
            ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");

            CustomerController customerController=(CustomerController) ctx.getBean("customer");
            int status=customerController.saveCustomer(new Customer("Selin","F",30));
            System.out.println(status);

//    int status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
//    System.out.println(status);
//    */

    /*Employee e=new Employee();
    e.setId(102);
    int status=dao.deleteEmployee(e);
    System.out.println(status);*/

        }

    }
