package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {


    public Employer(String value) {
        super(value);

    }

    public Employer(String value, int id) {
        super(value);
        JobField.id = id;
    }
    // Custom toString, equals, and hashCode methods:



    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        return getId() == getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:


    @Override
    public void describe() {

        return;



    }
}
