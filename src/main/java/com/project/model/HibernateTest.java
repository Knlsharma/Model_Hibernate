/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.model;

import com.project.model.Details.Emp;
import com.project.model.Details.Emp_address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author knl
 */
public class HibernateTest {

    private static Emp_address empadd;
    
    public static void main(String args[])
            
    {
        
  Emp e1 = new Emp();   


  e1.setCourse("B.tech");
  e1.setAddress("DEL");
  e1.setEmp_phone("897628");
  e1.setEmp_name("K1");
  
  Emp e2 = new Emp();   


  e2.setCourse("BCA");
  e2.setAddress("GH");
  e2.setEmp_phone("8557628");
  e2.setEmp_name("K2");
  
  Emp e3 = new Emp();   
   e3.setAdd(empadd);
  
  
  Emp_address empadd =new Emp_address();
  empadd.setAddress("del");
  
   Emp_address empadd1 =new Emp_address();
  empadd.setAddress("GHZ");
  
  
  
  
  
  
 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
  
  
  Session session = factory.openSession(); 
  session.beginTransaction();
  session.save(e1);
  session.save(e2);
  session.save(empadd);
  session.save(empadd1);
  session.getTransaction().commit();
 

   
     
        
}

}