package Utility;

import Pojo.Drug;
import Pojo.Patient;

public class DrugAssigner {
    private static final Drug DRUG_A = new Drug("A");
    private static final Drug DRUG_B = new Drug("B");
    public static void assignDrug(Patient patient) {
        double randomNum = Math.random();
        patient.setRandomNum(randomNum);
        if(patient.getAge() < 75) {
            if(patient.getWeight() < 65) {
                patient.setGroupNum(1);
                if(randomNum < 0.25) patient.setDrug(DRUG_A);
                else patient.setDrug(DRUG_B);
            }
            else {
                patient.setGroupNum(2);
                if(randomNum < 0.5) patient.setDrug(DRUG_A);
                else patient.setDrug(DRUG_B);
            }
        }
        else {
            if(patient.getWeight() < 65) {
                patient.setGroupNum(2);
                if(randomNum < 0.5) patient.setDrug(DRUG_A);
                else patient.setDrug(DRUG_B);
            }
            else {
                patient.setGroupNum(3);
                if(randomNum < 0.75) patient.setDrug(DRUG_A);
                else patient.setDrug(DRUG_B);
            }
        }
    }
}
