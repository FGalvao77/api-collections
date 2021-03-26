package me.fgalvao77

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value
    }

    fun findById(id: String) = map[id]
}
