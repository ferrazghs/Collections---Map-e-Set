package br.com.alura.test

import br.com.alura.model.DataBaseNames

fun testCollection() {
    val listNamesIt : Iterable<String> = listOf("Gabriel", "Henrique", "Souza", "Ferraz")
    val listNamesCl : Collection<String> = listOf("Gabriel", "Henrique", "Souza", "Ferraz")
    val listNamesLs : List<String> = listOf("Gabriel", "Henrique", "Souza", "Ferraz")

    for (list in listNamesIt) {
        println(list)
    }
    println(listNamesIt.contains("Gabriel"))
    println(listNamesCl.size)
    println(listNamesLs.get(1))

    val db = DataBaseNames()

    db.save("Alex")
    db.save("Maria")
    println(db.data)
}