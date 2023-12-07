package com.example.navigationcontrollerexample2023;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

   private String name;
   private String lastName;


   public Person(){}

   public Person(String name, String lastName) {
      this.name = name;
      this.lastName = lastName;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
}
