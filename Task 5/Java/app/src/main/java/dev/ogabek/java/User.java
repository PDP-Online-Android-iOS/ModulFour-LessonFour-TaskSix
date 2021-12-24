package dev.ogabek.java;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private final String name;
    private final String surname;
    private final String middleName;

    public User(String name, String surname, String middleName) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
    }

    protected User(Parcel in) {
        name = in.readString();
        surname = in.readString();
        middleName = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public String toString() {
        return name + " " + surname + " " + middleName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeString(middleName);
    }
}
