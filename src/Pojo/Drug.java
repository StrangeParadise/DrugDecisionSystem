// Written by Zoran Lang, 31 Dec 2020.
// This is a plain old java object for Drug.
package Pojo;

public class Drug {
    private String name;
    public Drug(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
