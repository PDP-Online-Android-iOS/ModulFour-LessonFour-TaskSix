package dev.ogabek.java;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Me implements Parcelable {

    private final String name;
    private final String surname;

    public Me(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private Me(Parcel in) {
        name = in.readString();
        surname = in.readString();
    }

    @NonNull
    @Override
    public String toString() {
        return name + " " + surname;
    }

    public static final Creator<Me> CREATOR = new Creator<Me>() {
        @Override
        public Me createFromParcel(Parcel in) {
            return new Me(in);
        }

        @Override
        public Me[] newArray(int size) {
            return new Me[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
    }
}
