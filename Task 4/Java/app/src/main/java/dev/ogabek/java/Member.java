package dev.ogabek.java;

import java.io.Serializable;

public class Member implements Serializable {

    private boolean isMember;

    public Member(boolean isMember) {
        this.isMember = isMember;
    }

    @Override
    public String toString() {
        return String.valueOf(isMember);
    }
}
