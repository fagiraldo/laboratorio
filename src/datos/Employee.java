package datos;

import java.util.Date;

/**
 *
 * @author B106 PC-11
 */
public abstract class Employee extends Person {

    protected Date hiringDate;

    public Employee(Date hiringDate, String id, String name) {
        super(id, name);
        this.hiringDate = hiringDate;
    }
    public Date getHiringDate() {
        return hiringDate;
    }
    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }
    public abstract float paySalary();

    @Override
    public String toString() {
        return super.toString() + "," + hiringDate.toString() ;
    }
    
    
}
