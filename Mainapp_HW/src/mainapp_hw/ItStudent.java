/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp_hw;

/**
 *
 * @author Reham Alswaisi
 */
public class ItStudent extends Student{
    private double mid;
    private double project;
    private double final_mark;

    public ItStudent( int id, String name, String major, double mid, double project, double final_mark) {
        super(id, name, major);
        this.mid = mid;
        this.project = project;
        this.final_mark = final_mark;
    }

    @Override
    public double getGrade() {
        return (mid*0.30) + (project*0.30) + (final_mark*0.40);
    }
    
    
    
}
