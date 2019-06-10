
package com.project.model.Details;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author knl
 */

@Entity
public class Emp_address {
    
    
    @Id
    private String id;
    private String address;
    
}
