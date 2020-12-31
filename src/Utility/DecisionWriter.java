package Utility;

import Pojo.Patient;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DecisionWriter {
    public static void writeDecision(List<Patient> p_list) {
        try {
            FileWriter fileWriter = new FileWriter("decisions.txt");
            BufferedWriter myWriter = new BufferedWriter(fileWriter);
            for(Patient patient : p_list) {
                myWriter.write("Name: " + patient.getName() + " Age: " + patient.getAge() + " Weight: " + patient.getWeight()
                        + " RandomNum: " + patient.getRandomNum() + " GroupNum: " + patient.getGroupNum() + " Drug: " + patient.getDrug().getName());
                myWriter.newLine();
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
