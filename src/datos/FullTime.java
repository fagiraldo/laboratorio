/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Date;

/**
 *
 * @author B106 PC-11
 */
public class FullTime extends Professor{
    private float salary;

    public FullTime(float salary, String school, String department, Date hiringDate, String id, String name) {
        super(school, department, hiringDate, id, name);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public float paySalary() {
      return this.salary;
    }
    
}
