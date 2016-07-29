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
public class Grad extends Student{
    private int courses;

    public Grad(int courses, String department, Date hiringDate, String id, String name) {
        super(department, hiringDate, id, name);
        this.courses = courses;
    }

    public int getCourses() {
        return courses;
    }

    public void setCourses(int courses) {
        this.courses = courses;
    }
    
    @Override
    public float paySalary() {
       if(this.courses == 1){
         return 2500000;
       }else if(this.courses ==2){
         return 3500000;
       }
       else{
         return 0;
       }
    }
    
    
}
