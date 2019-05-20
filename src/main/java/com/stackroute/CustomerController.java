package com.stackroute;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Calendar;

public class CustomerController {

        private JdbcTemplate jdbcTemplate;

        public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
            this.jdbcTemplate = jdbcTemplate;
        }

        public int saveCustomer(Customer c){
            String query="insert into customers (name,gender,age) values( '"+c.getName()+"','"+c.getGender()+"','"+c.getAge()+"')";
            return jdbcTemplate.update(query);
        }
        public int updateCustomer(Customer c){
            String query="update customers set name='"+c.getName()+"',gender='"+c.getGender()+"'age='"+c.getAge()+"' where id='"+c.getId()+"' ";
            return jdbcTemplate.update(query);
        }
        public int deleteCustomer(Customer c){
            String query="delete from customers where id='"+c.getId()+"' ";
            return jdbcTemplate.update(query);
        }

    }


