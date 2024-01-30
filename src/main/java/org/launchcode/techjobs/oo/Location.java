package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField {




    public Location(String value) {
        super(value);

    }

    public Location(String value, int id) {
        super(value);
        JobField.id = id;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.


    // Custom toString, equals, and hashCode methods:



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
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


