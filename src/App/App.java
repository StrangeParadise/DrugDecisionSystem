package App;
import Pojo.Patient;
import Utility.DecisionWriter;
import Utility.DrugAssigner;
import Utility.PatientScanner;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Patient> p_list = PatientScanner.scan(args[0]);
        for(Patient patient : p_list) {
            DrugAssigner.assignDrug(patient);
            System.out.println(patient.toString());
        }
        DecisionWriter.writeDecision(p_list);
    }
}
