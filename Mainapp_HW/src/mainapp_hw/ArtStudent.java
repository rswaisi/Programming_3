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
public class ArtStudent extends Student{
    private double mid;
    private double report;
    private double final_mark;

    public ArtStudent( int id, String name, String major, double mid, double report, double final_mark) {
        super(id, name, major);
        this.mid = mid;
        this.report = report;
        this.final_mark = final_mark;
    }

    @Override
    public double getGrade() {
        return (mid*0.40) + (report*0.10) + (final_mark*0.50);
    }
    
    
    
}
