/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author B106 PC-11
 */
public class UniversityStaff {
    
   private ArrayList<Person> payroll;

   public UniversityStaff() {
     this.payroll = new ArrayList<Person>();
   }
   
   public void addPerson(Person person){
     this.payroll.add(person);
   }
   
   
    
}
