package br.com.alura.model

class DataBaseNames {
    val data: Collection<String> get() = listNames.toList()

    fun save(name: String) {
        listNames.add(name)
    }

    companion object {
        val listNames = mutableListOf<String>()
    }
}