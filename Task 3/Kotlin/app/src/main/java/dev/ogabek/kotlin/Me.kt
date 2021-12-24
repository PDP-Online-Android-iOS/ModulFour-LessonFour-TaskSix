package dev.ogabek.kotlin

import android.os.Parcel
import android.os.Parcelable
import android.os.Parcelable.Creator

class Me : Parcelable {
    private val name: String?
    private val surname: String?

    constructor(name: String?, surname: String?) {
        this.name = name
        this.surname = surname
    }

    private constructor(`in`: Parcel) {
        name = `in`.readString()
        surname = `in`.readString()
    }

    override fun toString(): String {
        return "$name $surname"
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeString(surname)
    }

    companion object CREATOR : Creator<Me> {
        override fun createFromParcel(parcel: Parcel): Me {
            return Me(parcel)
        }

        override fun newArray(size: Int): Array<Me?> {
            return arrayOfNulls(size)
        }
    }
}