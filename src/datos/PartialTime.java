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
public class PartialTime extends Professor{
    private String category;
    private int classHours;

    public PartialTime(String category, int classHours, String school, String department, Date hiringDate, String id, String name) {
        super(school, department, hiringDate, id, name);
        this.category = category;
        this.classHours = classHours;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getClassHours() {
        return classHours;
    }

    public void setClassHours(int classHours) {
        this.classHours = classHours;
    }
    
    @Override
    public float paySalary() {
       if(this.category.equals("A")){
         return 60000*this.classHours;
       }else if(this.category.equals("B")){
        return 80000*this.classHours;
       }
       else if(this.category.equals("C")){
         return 100000*this.classHours;
       }else
           return 0;

    }
}
