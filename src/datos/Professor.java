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
public class Professor extends Employee{
    protected String school;
    protected String department;

    public Professor(String school, String department, Date hiringDate, String id, String name) {
        super(hiringDate, id, name);
        this.school = school;
        this.department = department;
    }

    @Override
    public float paySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
