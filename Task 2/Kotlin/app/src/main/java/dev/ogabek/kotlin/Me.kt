package dev.ogabek.kotlin

import java.io.Serializable

class Me(val name: String, val surname: String): Serializable {
    override fun toString(): String {
        return "$name $surname"
    }
}