package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {



    public PositionType(String value) {
        super(value, name, employer);

    }

    public PositionType(String value, int id) {
        super(value, name, employer);
        JobField.id = id;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.


    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return getId() == PositionType.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }


    // Getters and Setters:

    @Override
    public void describe() {

        return;



    }
}
