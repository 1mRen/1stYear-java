/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mARC
 */
public abstract class teacher implements teaching{
    String Fname;
    String Lname;
    double hrate;
    double hrs;
    
    public teacher(){
    Fname = "";
    Lname = "";
    hrate = 0;
    hrs = 0;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public double getHrate() {
        return hrate;
    }

    public void setHrate(double hrate) {
        this.hrate = hrate;
    }

    public double getHrs() {
        return hrs;
    }

    public void setHrs(double hrs) {
        this.hrs = hrs;
    }
    
    
    public abstract double compute(double hrs, double hrate);
    
    
    
}

