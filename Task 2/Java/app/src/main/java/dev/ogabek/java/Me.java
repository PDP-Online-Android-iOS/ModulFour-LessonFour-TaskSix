package dev.ogabek.java;

import java.io.Serializable;

public class Me implements Serializable {

    private String name;
    private String surname;

    public Me(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
