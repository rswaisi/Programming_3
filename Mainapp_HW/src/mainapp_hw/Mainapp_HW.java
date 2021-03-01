/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainapp_hw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reham Alswaisi
 */
public class Mainapp_HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<ItStudent> itStudentsArray = new ArrayList<>();
        itStudentsArray.add(new ItStudent(1, "Reham", "IT", 20, 30, 40));
        itStudentsArray.add(new ItStudent(2, "Neso", "IT", 20, 20, 10));
        itStudentsArray.add(new ItStudent(3, "Nana", "IT", 20, 15, 20));
        itStudentsArray.add(new ItStudent(4, "Lolo", "IT", 21, 30, 40));
        itStudentsArray.add(new ItStudent(5, "mama", "IT", 16, 23, 25));

        List<ArtStudent> artStudentsArray = new ArrayList<>();
        artStudentsArray.add(new ArtStudent(1, "A", "Art", 22, 8, 15));
        artStudentsArray.add(new ArtStudent(2, "B", "Art", 6, 23, 15));
        artStudentsArray.add(new ArtStudent(3, "C", "Art", 4, 23, 8));
        artStudentsArray.add(new ArtStudent(4, "D", "Art", 22, 5, 15));
        artStudentsArray.add(new ArtStudent(5, "E", "Art", 3, 23, 15));

        itStudentsArray.sort(new Comparator<ItStudent>() {
            @Override
            public int compare(ItStudent o1, ItStudent o2) {
                if (o1.getGrade() > o2.getGrade()) {
                    return -1;
                }
                return 0;
            }
        });

        artStudentsArray.sort(new Comparator<ArtStudent>() {
            @Override
            public int compare(ArtStudent o1, ArtStudent o2) {
                if (o1.getGrade() > o2.getGrade()) {
                    return -1;
                }
                return 0;
            }
        });

      try {
            PrintWriter out = new PrintWriter("sortedObjects.txt");
            String itStudent = "";
            String artStudent = "";
            for (int i = 0; i < itStudentsArray.size(); i++) {
                itStudent += itStudentsArray.get(i).getId() + " " + itStudentsArray.get(i).getName() + " "
                        + itStudentsArray.get(i).getMajor() + " " + itStudentsArray.get(i).getGrade() + "\n";
            }
            for (int i = 0; i < artStudentsArray.size(); i++) {
                artStudent += artStudentsArray.get(i).getId() + " " + artStudentsArray.get(i).getName() + " "
                        + artStudentsArray.get(i).getMajor() + " " + artStudentsArray.get(i).getGrade() + "\n";
            }
            String allStudent = itStudent +"*********************************\n"+ artStudent;
            System.out.println("" + allStudent);

            out.print(allStudent);
            out.flush();
            out.close();

            System.out.println("Done.....");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mainapp_HW.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
