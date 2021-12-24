package dev.ogabek.java;

import android.os.Parcel;
import android.os.Parcelable;

public class Member implements Parcelable {

    private boolean isMember;

    public Member(boolean isMember) {
        this.isMember = isMember;
    }

    protected Member(Parcel in) {
        isMember = in.readByte() != 0;
    }

    public static final Creator<Member> CREATOR = new Creator<Member>() {
        @Override
        public Member createFromParcel(Parcel in) {
            return new Member(in);
        }

        @Override
        public Member[] newArray(int size) {
            return new Member[size];
        }
    };

    @Override
    public String toString() {
        return String.valueOf(isMember);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (isMember ? 1 : 0));
    }
}
