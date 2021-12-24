package dev.ogabek.java;

import java.io.Serializable;

public class User implements Serializable {

    private final String name;
    private final String surname;
    private final String middleName;

    public User(String name, String surname, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + middleName;
    }
}
