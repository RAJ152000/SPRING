package com.crudspring.springcrud.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private Long id;
    private String customername;
    public Customer()
    {

    }
      public Customer(Long id,String customername)
      {
          this.id=id;
          this.customername=customername;
      }
      public Long getId()
      {
          return id;
      }
      public void setId(Long id)
      {
          this.id=id;
      }
      public String getCustomername()
      {
          return customername;
      }
      public void setCustomername(String customername)
      {
          this.customername=customername;
      }
      
}
