/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.model.Details;


import java.util.*;
import javax.persistence.*;

/**
 *
 * @author knl
 */

@Entity(name ="Good Employee")
@Table(name="Employee")


public class Emp {
    @Id @GeneratedValue
    private int id;
    private String emp_phone;
    private String emp_name;
    private String course;
    private String address;

    /**
     * @return the id
     */
  
    
   @OneToOne
   @JoinColumn(name ="add_table_emp")
   private Emp_address add;
    
    
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the emp_phone
     */
    public String getEmp_phone() {
        return emp_phone;
    }

    /**
     * @param emp_phone the emp_phone to set
     */
    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    /**
     * @return the emp_name
     */
    public String getEmp_name() {
        return emp_name;
    }

    /**
     * @param emp_name the emp_name to set
     */
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the add
     */
    public Emp_address getAdd() {
        return add;
    }

    /**
     * @param add the add to set
     */
    public void setAdd(Emp_address add) {
        this.add = add;
    }

    
    
    
    
    
}
