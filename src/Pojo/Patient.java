// Written by Zoran Lang, 31 Dec 2020.
// This is a plain old java object for Drug.
package Pojo;

public class Patient {
    private int ID;
    private String name;
    private int age;
    private double weight;
    private double randomNum;
    private int groupNum;
    private Drug drug;

    public Patient(int ID, String name, int age, double weight) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", randomNum=" + randomNum +
                ", groupNum=" + groupNum +
                ", drug=" + drug.toString() +
                '}';
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(double randomNum) {
        this.randomNum = randomNum;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
}
