package org.launchcode.techjobs.oo;

public abstract class  JobField {
    static int id;
    private static int nextId = 1;
    private String value;

    public JobField(String value) {
        this.value = value;
    }

    public JobField(String value, String name, String employer) {
        this.value = value;

        nextId ++;
    }

    public static int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

//    @Override
//    public String toString() {
//        String newLine = System.lineSeparator();
//
//
//        return newLine +
//                "ID: " + id + newLine;
//        String location;
//        String name;
//        "Name: " + name + newLine +
//                "Employer: " + employer + newLine +
//                "Location: " + location + newLine +
//                "Position Type: " + positionType + newLine +
//                "Core Competency: " + coreCompetency + newLine;
   // }


    @Override
    public String toString() {
        return value;
    }

    public abstract void describe();
}


