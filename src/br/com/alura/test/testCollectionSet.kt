package br.com.alura.test

fun testCollectionSet() {
    val courseKotlin = setOf<String>("Gabriel", "Henrique", "Ferraz", "Gabi")
    val courseAndroid = setOf<String>("Gabriel", "Henrique", "Lucas", "Matheus")
    val courses = courseKotlin + courseAndroid
    val coursesSet = mutableSetOf<String>()
    coursesSet.addAll(courseKotlin)
    coursesSet.addAll(courseAndroid)
    println(coursesSet)

    println(courseKotlin union courseAndroid)
    println(courseKotlin subtract courseAndroid)
    println(courseKotlin intersect courseAndroid)
}