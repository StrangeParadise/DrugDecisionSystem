// Written by Zoran Lang, 31 Dec 2020.
// This is a scanner class to read patients info from a text file.
package Utility;

import Pojo.Patient;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PatientScanner {
    public static List<Patient> scan(String fileName) {
        List<Patient> rs = new ArrayList<>();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] split = data.split("\\s+");
                int ID = Integer.parseInt(split[0]);
                String name = split[1] + " " + split[2];
                int age = Integer.parseInt(split[3]);
                double weight = Double.parseDouble(split[4]);
                Patient patient = new Patient(ID, name, age, weight);
                rs.add(patient);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return rs;
    }
}
