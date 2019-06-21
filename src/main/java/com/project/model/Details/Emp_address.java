
package com.project.model.Details;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author knl
 */

@Entity
public class Emp_address {
    
    
    @Id @GeneratedValue
    private int id;
    private String address;

    /**
     * @return the id
     */
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
    
}
