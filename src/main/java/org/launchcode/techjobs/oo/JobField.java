package org.launchcode.techjobs.oo;

public abstract class  JobField {
    static int id;
    private static int nextId = 1;
    private String value;
    final String name;
    final String employer;

    public JobField(String value, String name, String employer) {
        this.value = value;
        this.name = name;
        this.employer = employer;
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

    @Override
    public String toString() {
        String newLine = System.lineSeparator();


        return newLine +
                "ID: " + id + newLine;
        String location;
        "Name: " + name + newLine +
                "Employer: " + employer + newLine +
                "Location: " + location + newLine +
                "Position Type: " + positionType + newLine +
                "Core Competency: " + coreCompetency + newLine;
    }
    public abstract void describe();
}


