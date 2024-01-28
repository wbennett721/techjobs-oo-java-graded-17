package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    public CoreCompetency(String value) {
        super(value, name, employer);
    }

    public CoreCompetency(String value, int id) {
        super(value, name, employer);
        this.id = id;
    }


    // Custom toString, equals, and hashCode methods:



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public void describe() {

        return;


    }

}
