/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.model;

import com.project.model.Details.Emp;
import javax.security.auth.login.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author knl
 */
public class HibernateTest {
    
    public static void main(String args[])
            
    {
        
  Emp e1 = new Emp();   

  e1.setId("1");
  e1.setCourse("B.tech");
  e1.setAddress("DEL");
  e1.setEmp_phone("897628");
  e1.setEmp_name("K1");
  
  Emp e2 = new Emp();   

  e2.setId("2");
  e2.setCourse("BCA");
  e2.setAddress("GH");
  e2.setEmp_phone("8557628");
  e2.setEmp_name("K2");
  
  Emp e3 = new Emp();   

  e3.setId("3");
  e3.setCourse("MBA");
  e3.setAddress("DELYTUH");
  e3.setEmp_phone("895557628");
  e3.setEmp_name("K3");
  
 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
  
  
  Session session = factory.openSession(); 
  session.beginTransaction();
  session.save(e1);
  session.save(e2);
  session.save(e3);
  session.getTransaction().commit();
 
  


  
   Session x = factory.openSession(); 
    x.beginTransaction();
    e1=(Emp) session.get(Emp.class, 1);
    System.out.println("User received is " + e1.getEmp_name());
   
    
    
    
    
   
        
        
        
}

}